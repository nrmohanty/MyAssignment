package week3.day1.HomeAssignment;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update_Change_Request {

	@Test
	public void update() {
		// endpoint URL
		RestAssured.baseURI = "https://dev207418.service-now.com/api/now/table/";
		// authentication
		RestAssured.authentication = RestAssured.basic("admin", "3eEHrb5P%vA/");

		// form the Request body
		RequestSpecification input = RestAssured.given().contentType("application/json").when()
				.body("{\r\n" + "    \"description\": \"Need a New HP laptop\",\r\n"
						+ "    \"short_description\": \"Laptop\"\r\n" + "}");

		// send Request
		Response response = input.put("change_request/6e50d02c477a3550f5e8f1f4116d4384");
		String asPrettyString = response.asPrettyString();

		response.prettyPrint();
		//print response
		response.prettyPeek();
		System.out.println("The status line for put is" + response.getStatusLine());
		System.out.println("The response code for put is" + response.getStatusCode());
		

	}

}
