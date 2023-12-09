package week3.day2.HomeAssignment1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIssue extends BaseClass {

	@Test(dependsOnMethods="week3.day2.HomeAssignment1.CreateIssue.create")
	public void update() {
		
		// form the Request body
		RequestSpecification input = RestAssured.given().contentType("application/json").when()
				.body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
						+ "    }\r\n"
						+ "}");

		// send Request
		Response response = input.put("issue/"+issue_id);
		String asPrettyString = response.asPrettyString();

		response.prettyPrint();
		//print response
		response.prettyPeek();
		System.out.println("The status line for put is" + response.getStatusLine());
		System.out.println("The response code for put is" + response.getStatusCode());
		response.then().assertThat().statusCode(Matchers.equalTo(204));
		response.then().assertThat().statusLine(Matchers.containsString("204"));

	}

}
