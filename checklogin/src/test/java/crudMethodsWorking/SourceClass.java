package crudMethodsWorking;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class SourceClass {
	
	public static void main(String[] args) {
		
		//To send/create/input the data///POST
		
			RequestSpecification request = RestAssured.given();
		
					/*request.baseUri("https://reqres.in");
					request.body(HelperClass.dataInput());
					request.log().all();
					Response response=request.when().post("/api/users");
					ValidatableResponse jsonResponse = response.then();
					jsonResponse.statusCode(201);
					jsonResponse.log().all();*/
			
			String stringData=request.baseUri("https://reqres.in/")
					.body(HelperClass.dataInput())
					.log().all()
					.when()
					.post("/api/users")
					.then()
					.statusCode(201)
					.log().all()
					.extract().response().asString();
			
			
			JsonPath js=new JsonPath(stringData);
			
			String ee=js.get("email");
			
			System.out.println(ee);
			//To update the already existing data///PUT
			
			
			
			
			
	}
}
