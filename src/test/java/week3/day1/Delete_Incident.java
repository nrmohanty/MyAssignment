package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_Incident {
	
	@Test
	public void Delete() {
				// endpoint URL
				RestAssured.baseURI = "https://dev207418.service-now.com/api/now/table/";
				// authentication
				RestAssured.authentication = RestAssured.basic("admin", "3eEHrb5P%vA/");
		
				//Send Request
				Response response = RestAssured.delete("incident/47695c6447ba3550f5e8f1f4116d4302");
				
				//print response
				response.prettyPeek();
				System.out.println("Get status line for Delete Opration"+response.getStatusLine());
				System.out.println("Get response for Delete Opration"+response.getStatusCode());
	}

}
