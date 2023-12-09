package week3.day1;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_Incident_with_filebody {
	
	@Test
	public void CreateCRwithFB() {
		//endpoint URL
				RestAssured.baseURI="https://dev207418.service-now.com/api/now/table/";
				//authentication
				RestAssured.authentication=RestAssured.basic("admin", "3eEHrb5P%vA/");
				
				File file=new  File("./src/test/resources/CreateIncident.json");
				
				//form the Request body
				RequestSpecification input = RestAssured.given().contentType("application/json").when().body(file);
				
				//send Request 
				Response response = input.post("incident");
				
				//print response
				response.prettyPeek();
				
				//get status code
				int statusCode = response.getStatusCode();
				System.out.println("The status line is ------"+response.getStatusLine());
				System.out.println("The status code is ------"+response.getStatusCode());
				
				//Extract the sysid
				String sys_id = response.jsonPath().get("result.sys_id");
				
				System.out.println("The sys id is "+sys_id);
				
		
	}

}
