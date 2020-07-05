package libraryAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class UsingDataProvider {
	
	@DataProvider(name="forJson")
	public Object[][] container(){
		
		return new Object[][] {
			
			{"Art","001"},{"BaseBass","002"},{"Curiosity","003"}
		};
	}
	
	@Test(dataProvider = "forJson")
	public void postOpetation(String name, String asile) {
		
		String data = RestAssured.given().baseUri("http://216.10.245.166").body(DataClass.data(name, asile))
								 .when().post("Library/Addbook.php")
								 .then().log().all().assertThat().statusCode(200).extract().response().asString();	
		
		JsonPath js=new JsonPath(data);
		
		String id = js.get("ID").toString();
		System.out.println(id);
			
	}
	
	
}
	
	
