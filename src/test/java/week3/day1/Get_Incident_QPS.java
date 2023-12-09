package week3.day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Incident_QPS {

	@Test
	public void GetChangeRequestWithQPS() {

		// endpoint URL
		RestAssured.baseURI = "https://dev207418.service-now.com/api/now/table/";
		// authentication
		RestAssured.authentication = RestAssured.basic("admin", "3eEHrb5P%vA/");
		Map<String, String> queryParameters = new HashMap<String, String>();
		queryParameters.put("sysparm_fields", "sys_id,number,short_description,description");
		queryParameters.put("sysparm_limit", "3");

		Response response = RestAssured.given().queryParams(queryParameters).get("incident");

		List<String> sys_ids = response.jsonPath().getList("result.sys_id");
		System.out.println("size of the list is------" + sys_ids.size());

		response.prettyPrint();
		//print response
				response.prettyPeek();
	}

}
