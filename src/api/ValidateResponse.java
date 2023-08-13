package api;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateResponse {
	@Test
	public void validateResponse() {
		
		RestAssured.baseURI = "http://demoqa.com/utilities/weather/city";
		RequestSpecification req = RestAssured.given();
		Response resp = req.get("/pune");
		System.out.println(resp.asString());
		
		//retrive body of the response
		ResponseBody body = resp.getBody();
		System.out.println("response body : "  +  body.asString());
		
		//validate from response body
		String s=body.asString();
		Assert.assertEquals(s.contains("pune"),true);
		System.out.println("pune found in body");
		
		//validate statuscode and status line
		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
	Assert.assertEquals(statuscode, 200);
		System.out.println("status varified");
		
		//validate status line
		String St = resp.getStatusLine();
		System.out.println(St);
		Assert.assertEquals(St, "HTTP/1.1 200 OK");
		System.out.println("status line varified");
		}

}
