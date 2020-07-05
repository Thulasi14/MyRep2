package readwrite;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StoringWebTableToExcel {
	
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> wholeTable = driver.findElements(By.xpath("//table[@height='100%']//tr"));
		System.out.println("Total Number of Rows in the wholetable:"+wholeTable.size());	
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@width='270'][@border='0']//tr"));		
		System.out.println("Total Number of Rows in the workingTable:"+rows.size());
		
		List<Integer> l=new ArrayList<Integer>();	

		int[] x=new int[rows.size()];
		
		for(int i=0;i<rows.size();i++) {
			
			String s=null;
			String s1=null;
			
			List<WebElement> data = rows.get(i).findElements(By.xpath("//table[@width='270'][@border='0']//tr["+(i+1)+"]/td[2]"));
			for(int j=0;j<data.size();j++) {
				
				s=data.get(j).getText().toString();
				s1=s.replace('$', '0');
				x[i]=Integer.parseInt(s1);
				
				
		}		
	}
		driver.close();

		int big=0;
		for(int k=1;k<x.length;k++) {
			int y=x[0];
			
			if(k==2) {
				System.out.println("Third Value in the workingTable:"+x[k]);
			}
			if(y<x[k]) {
				big=x[k];
			}
		}
		System.out.println("And the highest Price:"+big);
		
		
	}

}
