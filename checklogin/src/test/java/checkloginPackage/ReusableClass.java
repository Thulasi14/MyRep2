package checkloginPackage;

import io.restassured.path.json.JsonPath;

public class ReusableClass {
	
	public static JsonPath reusableMethod(String st){
		
		return new JsonPath(st);
		
	}

}
