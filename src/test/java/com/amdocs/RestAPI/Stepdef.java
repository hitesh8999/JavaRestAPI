package com.amdocs.RestAPI;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment =WebEnvironment.DEFINED_PORT,classes=RestApiApplication.class)
public class Stepdef {
	
	String RestapiUrl;
	double result;
	@Given("Rest Api {string}")
	public void rest_Api(String restApiurl) {
		this.RestapiUrl=restApiurl;
	}

	@When("invoking REST api for addition")
	public void invoking_REST_api_for_addition() {
		RestTemplate restTemplate=new RestTemplate();
		result=restTemplate.getForObject(RestapiUrl, Double.class);
	}

	@Then("expecting result {int}")
	public void expecting_result(Integer expected) {
		assertEquals(expected, result,0.01);

	}


}
