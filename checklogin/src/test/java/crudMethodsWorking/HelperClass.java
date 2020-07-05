package crudMethodsWorking;

public class HelperClass {
	
	public static String dataInput() {
		
		return "{\\r\\n\" + \r\n" + 
				"					\"    \\\"name\\\": \\\"morpheus\\\",\\r\\n\" + \r\n" + 
				"					\"    \\\"job\\\": \\\"leader\\\"\\r\\n\" + \r\n" + 
				"					\"}";
	}
	
	
	public static String updatePlace(String jobAddress) {
		
		return "{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \""+jobAddress+"\",r\n" + 
				"}";
	}
	

}
