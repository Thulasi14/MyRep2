package readwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	
	public static void main(String[] args) throws IOException {
		
		Workbook wb=null;
	
		try(InputStream ip =new FileInputStream("C:\\Users\\home\\Desktop\\Thulasi StudyMaterials\\TestExcel.xlsx")){
			
			wb=new XSSFWorkbook(ip);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sh = wb.getSheetAt(0);
		
		int physicalNumberOfRows = sh.getPhysicalNumberOfRows();
		
		for(int i=0;i<physicalNumberOfRows;i++) {
			
			Row row = sh.getRow(i);
			
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			
			for(int j=0;j<physicalNumberOfCells;j++) {
				
				System.out.print(row.getCell(j)+" ");
			}
			
			System.out.println();
		}
	}

}
