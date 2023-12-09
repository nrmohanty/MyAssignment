package chaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident extends BaseClass {

	@Test
	public void create() {

		// form the Request body
		RequestSpecification input = RestAssured.given().contentType("application/json").when()
				.body("{\r\n" + "    \"description\": \"Need a New DELL laptop\",\r\n"
						+ "    \"short_description\": \"DELL Laptop\"\r\n" + "}");

		// send Request
		Response response = input.post("incident");

		// print response
		response.prettyPeek();

		// get status code
		int statusCode = response.getStatusCode();
		System.out.println("The status line is ------" + response.getStatusLine());
		System.out.println("The status code is ------" + response.getStatusCode());

		// Extract the sysid
		sys_id = response.jsonPath().get("result.sys_id");

		System.out.println("The sys id is " + sys_id);

		response.then().assertThat().statusCode(Matchers.equalTo(201));

	}

}
