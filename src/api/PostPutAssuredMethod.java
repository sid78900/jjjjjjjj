package api;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import groovy.transform.Undefined.EXCEPTION;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PostPutAssuredMethod  {
	@Test
	public void getDetails() throws EXCEPTION, Exception {
		
		io.restassured.RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";//provide by developer
		
		RequestSpecification httprequest = io.restassured.RestAssured.given();
		
		JSONObject reqPar = new JSONObject();
		reqPar.put("userID", "TQ123");
		reqPar.put("isbn", "9781449325862");
		
		//add header stating the tequest body is json
		httprequest.header("Content-Type","application/json"); //add json to body o the req
	
		httprequest.body(reqPar.toString());
		Response resp = httprequest.post("/BookStoreV1BooksPost");
		
	System.out.println("status recievd : " +  resp.statusLine());

}
}