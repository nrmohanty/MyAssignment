package week3.day2.ClassroomActivity;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update_Change_Request extends BaseClass {

	@Test(dependsOnMethods="week3.day2.ClassroomActivity.CreateChangeRequest.create")
	public void update() {
		
		// form the Request body
		RequestSpecification input = RestAssured.given().contentType("application/json").when()
				.body("{\r\n" + "    \"description\": \"Need a New HP laptop\",\r\n"
						+ "    \"short_description\": \"Laptop\"\r\n" + "}");

		// send Request
		Response response = input.put("change_request/"+sys_id);
		String asPrettyString = response.asPrettyString();

		response.prettyPrint();
		//print response
		response.prettyPeek();
		System.out.println("The status line for put is" + response.getStatusLine());
		System.out.println("The response code for put is" + response.getStatusCode());
		response.then().assertThat().statusCode(Matchers.equalTo(200));
		response.then().assertThat().statusLine(Matchers.containsString("200"));

	}

}
