package steps;

import java.io.File;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinition {

	public static Response response;
	public static RequestSpecification inputRequest;
	public static String issue_id;

	@Given("set the Endpoint")
	public void setUrl() {
		RestAssured.baseURI ="https://nmtest123.atlassian.net/rest/api/2/";
	}

	@And("Set the Auth")
	public void setAuth() {

		RestAssured.authentication = RestAssured.preemptive().basic("nihar.1978@gmail.com",
				"ATATT3xFfGF06O5tNjCP-6iFNVHvfxOapWdF7tNUdXJfLs8kt2_lqTu7tTNJASUhrTgWKbyAEWRgE2wP5WAMqGBsGRRwEqkHyXw1fuBAS-UqKo9s5D2-bnMgZpLbJae9sc94fyzcI0et4vFN1XZdg7YR3ecw2_ZFFBTHdwScsmyIjkhTMhKvsWY=4D3F9FB6");

	}

	
	@When("Create issue with string body {string}")
	public void createIncident(String body) {

		inputRequest = RestAssured.given().contentType("application/json").when().body(body);
		response = inputRequest.post("issue");
		issue_id = response.jsonPath().get("id");

	}
	
	@When("Create issue with multiple data string body {string}")
	public void createIncidentMultiData(String body) {
		inputRequest = RestAssured.given().contentType("application/json").when().body(body);
		response = inputRequest.post("issue");
		issue_id = response.jsonPath().get("id");
		System.out.println("The Response Code for Create issue-->" + response.getStatusCode());

		System.out.println("The Response line for Create Issue-->" + response.getStatusLine());
	}

	@When("update issue with string body {string}")
	public void updateIncident(String body) {

		inputRequest = RestAssured.given().contentType("application/json").when().body(body);
		response = inputRequest.put("issue/" + issue_id);
		response.prettyPrint();

	}

	
	@Then("validate response code as {int}")
	public void validateStatusCode(int responseCode) {
		response.then().assertThat().statusCode(responseCode);
	}

	@When("Delete the issue")
	public void deleteIncident() {
		response = RestAssured.delete("issue/" + issue_id);
	}
	
}
