package checkloginPackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class JsonParsing {
	public static void courseDetails(String st){
	
	JsonPath js=ReusableClass.reusableMethod(st);
	
	//1.Print No of courses returned by API
		List<Map<Object,Object>> li1=js.get("courses");
	
		System.out.println(li1);
		System.out.println("Course Size: "+li1.size());
		
	//2.Print Purchase Amount
		System.out.println("Price Purchase Amount:");
		
		for(int i=0;i<li1.size();i++) {
			
			Object value=li1.get(i).get("price");
			System.out.print(value.toString()+",");
		}
		
		System.out.println();
		
	//3.Print Title of the first course
		Object courseTitle=li1.get(0).get("title");
		System.out.println("First Course Title: "+courseTitle.toString());
			
	//4.Print All course titles and their respective Prices
		Map<Object,Object> m=new LinkedHashMap<Object,Object>();
		for(int p=0;p<li1.size();p++) {
			m.put(li1.get(p).get("title"), li1.get(p).get("price"));
		}
		System.out.println(m);
		
	//5.Print no of copies sold by RPA Course
			for(int i=0;i<li1.size();i++) {
				
				Object rpa=li1.get(i).get("title");
				if(rpa.toString().equalsIgnoreCase("RPA")) {
					System.out.println("Copies Sold for RPA:"+li1.get(i).get("copies"));	
				}
			}
			
	//6.Verify if Sum of all Course prices matches with Purchase Amount
			int sum=0;
			for(int j=0;j<li1.size();j++) {
				
				Object priceValue=li1.get(j).get("price");
				Object copy=li1.get(j).get("copies");
				int k=Integer.parseInt(priceValue.toString());
				int l=Integer.parseInt(copy.toString());
				sum=sum+(k*l);
				}
			
			Object totalPurchaseAmount=js.get("dashboard.purchaseAmount");
			int amount=Integer.parseInt(totalPurchaseAmount.toString());
	
			if(sum==amount)
			  System.out.println("Sum of purchase value equals total value in Dashboard:" +sum+" "+amount); 
		}
	
	public static void main(String[] args) {
		
		
		JsonComplexFile js=new JsonComplexFile();
		//noOfCourses(js.jsonFile());
		courseDetails(js.jsonFile());
		
		
	}
	


}
