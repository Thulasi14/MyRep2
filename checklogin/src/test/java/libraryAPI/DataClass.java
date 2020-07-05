package libraryAPI;

public class DataClass {
	
public static String dataManualEntry() {
		
		return "{\r\n" + 
				"\"name\":\"Computer_Science\",\r\n" + 
				"\"isbn\":\"cps\",\r\n" + 
				"\"aisle\":\"584\",\r\n" + 
				"\"author\":\"Jobs\"\r\n" + 
				"}";
	}
	
public static String data(String bookName, String bookisbn) {
		
		return "{\r\n" + 
				"\"name\":\""+bookName+"\",\r\n" + 
				"\"isbn\":\""+bookisbn+"\",\r\n" + 
				"\"aisle\":\"473\",\r\n" + 
				"\"author\":\"Steve\"\r\n" + 
				"}";
	}

}
