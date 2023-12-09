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
    public static String sys_id;
	
	@Given("set the Endpoint")
	public void setUrl() {
		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table/";
	}

	@And("Set the Auth")
	public void setAuth() {

		RestAssured.authentication=RestAssured.basic("admin", "NQvluT54==pQ");
	}

	@When("get All incidents")
	public void getIncidents() {

		response = RestAssured.get("incident");
	}

	@When("Create incident with string body {string}")
	public void createIncident(String body) {

		inputRequest = RestAssured.given().contentType("application/json").when().body(body);
		response= inputRequest.post("incident");
		sys_id=response.jsonPath().get("result.sys_id");

	}
    
	
	@When("update incident with string body {string}")
	public void updateIncident(String body) {

		inputRequest = RestAssured.given().contentType("application/json").when().body(body);
		response= inputRequest.put("incident/"+sys_id);
		response.prettyPrint();

	}
	
	
	@When("Delete the incident")
	public void deleteIncident() {
		response = RestAssured.delete("incident/"+sys_id);
	}
	
	
	
	
	
	
	
	@When("Create incident with file {string}")
	public void createIncidentWithfile(String fileName) {
		
		File file=new File("./src/test/resources/"+fileName);
		inputRequest = RestAssured.given().contentType("application/json").when().body(file);
		response= inputRequest.post("incident");
		response.prettyPrint();
		
	}


	@Then("validate response code as {int}")
	public void validateStatusCode(int responseCode) {
		response.then().assertThat().statusCode(responseCode);
	}

}
