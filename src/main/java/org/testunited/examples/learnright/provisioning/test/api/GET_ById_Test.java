package org.testunited.examples.learnright.provisioning.test.api;

import static io.restassured.RestAssured.get;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class GET_ById_Test extends ProvisioningApiTestBase {

	@BeforeEach
	@Override
	public void setup() {
		super.setup();
	}

	@Test()
	public void success_statuscode() {
		get("/1").then().assertThat().statusCode(200);
	}

	@Test()
	public void success_bodylength() {
		get("/1").then().statusCode(200).assertThat().body("id", Matchers.is(1));
	}
}
