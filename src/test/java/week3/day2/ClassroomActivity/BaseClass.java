package week3.day2.ClassroomActivity;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
	public static String sys_id;

	@BeforeMethod
	
	public void base() {
		// endpoint URL
		RestAssured.baseURI = "https://dev207418.service-now.com/api/now/table/";
		// authentication
			RestAssured.authentication = RestAssured.basic("admin", "3eEHrb5P%vA/");

	}

	
}
