package org.testunited.examples.learnright.provisioning.test.api;

import org.testunited.examples.learnright.test.util.PropertyReader;

import io.restassured.RestAssured;

public class ProvisioningApiTestBase {
	protected static PropertyReader prop = new PropertyReader(ProvisioningApiTestBase.class);

	protected void setup() {
		RestAssured.baseURI = prop.getPropValue("course.service.url");
		RestAssured.port = Integer.parseInt(prop.getPropValue("course.service.port"));
		RestAssured.basePath = prop.getPropValue("course.service.basepath");
	}
}
