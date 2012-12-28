package com.britebill.it;

import org.junit.Test;

/**
 * A jUnit 4 integration test. Maven will deploy the war to an embedded tomcat
 * before executing this test
 */
public class SimpleIntegrationTest {

	@Test
	public void testAreIntegrationTestsRunning() {

		// Integration tests should have access to the environment variable
		// "tomcat.port" provided by the maven-failsafe-plugin

		String tomcatPort = System.getenv("tomcat.port");

		System.out.println("INTEGRATION TESTS RUNNING - Using Tomcat Port " + tomcatPort);

	}

}
