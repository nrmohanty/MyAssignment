package week3.day2.ClassroomActivity;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Change_Request_QP extends BaseClass {

	@Test(dependsOnMethods="week3.day2.ClassroomActivity.CreateChangeRequest.create")
	public void GetChangeRequestWithQP() {

		
		
		Response response = RestAssured.given().queryParam("sysparm_fields", "sys_id,number,short_description,description").get("change_request");
		response.prettyPrint();
		//print response
				response.prettyPeek();
				System.out.println("The sys id is " + sys_id);
				response.then().assertThat().statusCode(Matchers.equalTo(200));
				response.then().assertThat().body("result.sys_id",Matchers.hasItem(sys_id));
				response.then().assertThat().body("result.number",Matchers.hasItem("CHG0030029"));
				
				

	}
}
