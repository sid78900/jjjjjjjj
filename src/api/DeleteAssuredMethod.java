package api;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DeleteAssuredMethod {
	@Test
	public void deleterecord() throws JSONException {
		int id=15410;
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RequestSpecification req = RestAssured.given();
		//jason object is class that represents a simple json
		
		JSONObject reqpar = new JSONObject();
		reqpar.put("name", "sid");
		reqpar.put("age", "30");
		reqpar.put("salary", "300");
		
		req.header("content-type","application/json");
		Response res = req.delete("/delete/" + id);
		
		System.out.println("status recieved : " + res.statusLine());
		int statusCode = res.getStatusCode();
		System.out.println("status code : " + statusCode);
		System.out.println(res.asString());
		Assert.assertEquals(statusCode, 301);
	}
	

	

}
