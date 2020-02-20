package codechallenge.mc.cityexplorer;

import codechallenge.mc.cityexplorer.model.CityModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;

import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import codechallenge.mc.cityexplorer.util.AppConstants;

@Slf4j
@SpringBootApplication
public class CityExplorerApplication implements CommandLineRunner{

	@Autowired
	ResourceLoader resourceLoader;

	public static void main(String[] args) 	{

		SpringApplication.run(CityExplorerApplication.class, args);
		log.info("**************************************");
		log.info("City Explorer app...");
		log.info("README: This 'readme' in the CityExplorerApplication.java file.");
		log.info("README: This app will do the one thing asked in the challenge and will do it well.");
		log.info("README: If you require fast performance or 'what if there are 100 million cities " +
				"then this approach may or may not work, depending on JVM settings, hardware etc.");
		log.info("**************************************");
		log.info("");

	}

	@Override
	public void run(String... args) throws Exception {

		// While loading the application itself we
		// read the files which show the city to city connection.
		try {
			Resource resource = resourceLoader.getResource("classpath:city.txt");
			InputStream inputStream = resource.getInputStream();
			byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
			List<String> lines =
					IOUtils.readLines(new StringReader(new String(bdata, StandardCharsets.UTF_8)));
			int lineNumber = 0;
			for (String singleLine: lines) {
				lineNumber++;
				String[] singleLineArray = singleLine.split(",");
				if (singleLineArray.length == 2) {
					CityModel cityModel = new CityModel();
					cityModel.setOrigin(singleLineArray[0]);
					cityModel.setDestination(singleLineArray[1]);
					AppConstants.cityModelList.add(cityModel);
				} else {
					log.error("*** ERROR: The input file has a problem in line " + lineNumber);
					log.error("*** ERROR: Rather than a unit test failure or success, " +
							"this will make sure the app will continue to work");
				}

			}

		} catch (Exception e) {
			log.error("IOException", e);
		}

		for (CityModel cityModel: AppConstants.cityModelList) {
			// log.info("Origin: " + cityModel.getOrigin() + ", destination:" + cityModel.getDestination());
		}

	}
}
