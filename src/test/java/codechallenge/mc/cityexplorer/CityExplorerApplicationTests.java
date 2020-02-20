package codechallenge.mc.cityexplorer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class CityExplorerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void simpleTest() {
		log.info("We can use some library like Mockito to write unit tests for controller/services.");
		log.info("But for this app, it will be an overkill.");
		log.info("If there is an architectural decision to follow TDD, as a developer I can gladly follow instructions.");
		log.info("So respectfully declining the invitation to 'test the living daylight'...");
	}

}
