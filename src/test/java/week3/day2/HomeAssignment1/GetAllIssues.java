package week3.day2.HomeAssignment1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllIssues extends BaseClass{

	@Test(dependsOnMethods="week3.day2.HomeAssignment1.CreateIssue.create")
	public void GetChangeRequestWithQPS() {

		
		Map<String, String> queryParameters = new HashMap<String, String>();
		queryParameters.put("jql", "project=RestAPINov2023");
	
		Response response = RestAssured.given().queryParams(queryParameters).get("issue");

		List<String> ids = response.jsonPath().getList("issues.id");
		System.out.println("size of the list is------" + ids.size());

		response.prettyPrint();
		//print response
				response.prettyPeek();
	}

}
