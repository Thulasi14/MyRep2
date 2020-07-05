package readwrite;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClassWebTableToExcel  {
		
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	
	WebElement table=d.findElement(By.xpath("//table[@id='customers']"));
	
	
	List<String> li=new ArrayList<String>();
	List<List<String>> li1=new ArrayList<List<String>>();
	
	List<WebElement> rows=table.findElements(By.tagName("tr"));
	//List<WebElement> header=table.findElements(By.tagName("th"));
	
	
	for(int i=1;i<rows.size();i++){
		List<WebElement> datas=d.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]/td"));
		for(int j=0;j<datas.size();j++){
			li.add(datas.get(j).getText());
		}
		li1.add(li);
		li=new ArrayList<String>();
		
	}
	System.out.println(li1);
		
	Workbook wb=new XSSFWorkbook();
	
	Sheet sh = wb.createSheet("Table Data");
	
	for(int i=0;i<li1.size();i++) {
		
		Row row = sh.createRow(i);
		
		List<String> list = li1.get(i);
		
		for(int j=0;j<list.size();j++) {
			
			row.createCell(j).setCellValue(list.get(j));
			
		}
	}

		try(OutputStream os=new FileOutputStream("./WebTableFolder/WebTableData.xlsx")){
			
			wb.write(os);
		}
		
		catch(Exception e) {
			
			System.out.println("File Not Found");
		}

	}

}
