package week3.day1.HomeAssignment;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Change_Request_QP {

	@Test
	public void GetChangeRequestWithQP() {

		// endpoint URL
		RestAssured.baseURI = "https://dev207418.service-now.com/api/now/table/";
		// authentication
		RestAssured.authentication = RestAssured.basic("admin", "3eEHrb5P%vA/");
		
		Response response = RestAssured.given().queryParam("sysparm_fields", "sys_id,number,short_description,description").get("change_request");
		response.prettyPrint();
		//print response
				response.prettyPeek();

	}
}
