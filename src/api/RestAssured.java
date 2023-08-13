package api;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssured {

	@Test
	public void getDetails() {
		
		io.restassured.RestAssured.baseURI = "https://demoqa.com/BookStore/v1Books";//provide by developer
		
		RequestSpecification httprequest = io.restassured.RestAssured.given();		
	
		Response resp = httprequest.request(Method.GET,"");
		
		ResponseBody body = resp.getBody();
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
	//	System.out.println(resp.prettyPrint());
		System.out.println(body.asString());
		
		//validate response header
		Headers allhead = resp.headers();
		for(Header header : allhead) {
			System.out.println(header.getName() + " : " + header.getValue());
				}
		}
}
