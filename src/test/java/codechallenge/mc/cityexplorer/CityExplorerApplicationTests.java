package codechallenge.mc.cityexplorer;

import codechallenge.mc.cityexplorer.controllers.CityConnectorController;
import codechallenge.mc.cityexplorer.services.CityDetailsService;
import codechallenge.mc.cityexplorer.util.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;

@Slf4j
@SpringBootTest
class CityExplorerApplicationTests {

	@Autowired
	private CityConnectorController cityConnectorController;

	@Autowired
	private CityDetailsService cityDetailsService;

	@Autowired
	ResourceLoader resourceLoader;

	@Test
	void contextLoads() {
	}

	// This test will check if the text file with the list of cities is empty or not
	@Test
	void checkArray() throws IOException {

		Resource resource = resourceLoader.getResource("classpath:city.txt");
		InputStream inputStream = resource.getInputStream();
		byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
		List<String> lines =
				IOUtils.readLines(new StringReader(new String(bdata, StandardCharsets.UTF_8)));

		Assert.assertNotNull(lines.isEmpty());
	}

	// check if a controller, service etc. are available...
	@Test
	void componentTests(){
		assertThat(cityConnectorController).isNotNull();
		assertThat(cityDetailsService).isNotNull();
	}





}
