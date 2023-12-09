package week3.day2.HomeAssignment1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetIssue extends BaseClass {

	@Test(dependsOnMethods="week3.day2.HomeAssignment1.CreateIssue.create")
	public void GetChangeRequestWithQP() {

		
		
		
		Response response = RestAssured.given().queryParam("issue_id").get("issue");	
				
		response.prettyPrint();
		//print response
				response.prettyPeek();
				System.out.println("The issue id is " + issue_id);
				response.then().assertThat().statusCode(Matchers.equalTo(200));
				response.then().assertThat().body("id",Matchers.hasItem(issue_id));
				response.then().assertThat().body("key",Matchers.hasItem(key_value));
				
				

	}
}
