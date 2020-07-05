package libraryAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class ImpClass {

	
	public static void main(String[] args) {
		
	RequestSpecification req = RestAssured.given();
	
	String status = req.baseUri("http://216.10.245.166").log().all().body(DataClass.dataManualEntry())
	.when().post("Library/Addbook.php")
	.then().log().all().extract().response().asString();
	
	JsonPath js=new JsonPath(status);
	
	String actualName=js.get("ID");
	
	System.out.println(actualName);
	
	}
}
