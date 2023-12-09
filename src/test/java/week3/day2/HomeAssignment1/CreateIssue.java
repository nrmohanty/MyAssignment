package week3.day2.HomeAssignment1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssue extends BaseClass {

	@Test
	public void create() {

		// form the Request body
		RequestSpecification input = RestAssured.given().contentType("application/json").when()
				.body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "        \"project\": {\r\n"
						+ "            \"key\": \"RES\"\r\n"
						+ "        },\r\n"
						+ "        \"summary\": \"create issue in RA project\",\r\n"
						+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
						+ "        \"issuetype\": {\r\n"
						+ "            \"name\": \"Bug\"\r\n"
						+ "        }\r\n"
						+ "    }\r\n"
						+ "}");

		// send Request
		Response response = input.post("issue");

		// print response
		response.prettyPeek();

		// get status code
		int statusCode = response.getStatusCode();
		System.out.println("The status line is ------" + response.getStatusLine());
		System.out.println("The status code is ------" + response.getStatusCode());

		// Extract the sysid
		issue_id = response.jsonPath().get("id");
		key_value=response.jsonPath().get("key");

		System.out.println("The issue id is " + issue_id);
		System.out.println("The key value is " + key_value);
		response.then().assertThat().body("id",Matchers.containsString("100"));
		response.then().assertThat().body("key",Matchers.containsString("RES"));
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		response.then().assertThat().statusLine(Matchers.containsString("201"));

	}

}
