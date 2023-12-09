package asserts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident {
	
	@Test
	public void create() {
		
		//endpoint URL
		RestAssured.baseURI="https://dev207418.service-now.com/api/now/table/";
		//authentication
		RestAssured.authentication=RestAssured.basic("admin", "3eEHrb5P%vA/");
		
		//form the Request body
		RequestSpecification input = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"description\": \"Need a New DELL laptop\",\r\n"
				+ "    \"short_description\": \"DELL Laptop\"\r\n"
				+ "}");
		
		//send Request 
		Response response = input.post("incident");
		
		//assertion		
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		response.then().assertThat().body(Matchers.contains("INC"));
		
	}

}
