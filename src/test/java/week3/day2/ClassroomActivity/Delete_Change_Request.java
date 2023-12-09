package week3.day2.ClassroomActivity;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_Change_Request extends BaseClass {
	
	@Test(dependsOnMethods="week3.day2.ClassroomActivity.Update_Change_Request.update")
	public void Delete() {
						
				//Send Request
				Response response = RestAssured.delete("change_request/"+sys_id);
				
				//print response
				response.prettyPeek();
				System.out.println("Get status line for Delete Opration"+response.getStatusLine());
				System.out.println("Get response for Delete Opration"+response.getStatusCode());
				response.then().assertThat().statusCode(Matchers.equalTo(204));
	}

}
