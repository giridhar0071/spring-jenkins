package com.draft.integrationwithjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IntegrationwithjenkinsApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(IntegrationwithjenkinsApplicationTests.class);

	@Test
	public contextLoads() {
		logger.info("Test is executing");
		assertEquals(true,true);
	}

}
