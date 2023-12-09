package week3.day2.HomeAssignment1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIssue extends BaseClass {
	
	@Test(dependsOnMethods="week3.day2.HomeAssignment1.UpdateIssue.update")
	public void Delete() {
						
				//Send Request
				Response response = RestAssured.delete("issue/"+issue_id);
				
				//print response
				response.prettyPeek();
				System.out.println("Get status line for Delete Opration"+response.getStatusLine());
				System.out.println("Get response for Delete Opration"+response.getStatusCode());
				response.then().assertThat().statusCode(Matchers.equalTo(204));
	}

}
