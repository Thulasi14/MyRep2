package jsonDataAnalyzing;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class JsonMap {
	
	@Test
	public void validation()
	{
		HashMap<String,Object> h=new HashMap();
		HashMap<String,Object> h1=new HashMap();
		
		h.put("username", "admin");
		h.put("password", "password123");
		
		//h1.put("Biodata", h);
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/auth";
		
		RestAssured.given().log().all().contentType(ContentType.JSON).body(h).
		when().post().then().log().all().assertThat().statusCode(200);	
		
	}
}
