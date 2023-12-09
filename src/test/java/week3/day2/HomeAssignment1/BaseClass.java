package week3.day2.HomeAssignment1;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
	public static String issue_id;
	public static String key_value;

	@BeforeMethod

	public void base() {
		// endpoint URL
		RestAssured.baseURI = "https://nmtest123.atlassian.net/rest/api/2/";
		// authentication
		RestAssured.authentication = RestAssured.preemptive().basic("nihar.1978@gmail.com",
				"ATATT3xFfGF06O5tNjCP-6iFNVHvfxOapWdF7tNUdXJfLs8kt2_lqTu7tTNJASUhrTgWKbyAEWRgE2wP5WAMqGBsGRRwEqkHyXw1fuBAS-UqKo9s5D2-bnMgZpLbJae9sc94fyzcI0et4vFN1XZdg7YR3ecw2_ZFFBTHdwScsmyIjkhTMhKvsWY=4D3F9FB6");

	}

}
