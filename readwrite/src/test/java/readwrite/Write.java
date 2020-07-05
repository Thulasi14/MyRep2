package readwrite;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	
	public static void main(String[] args) {
		
		Workbook wb=new XSSFWorkbook();
		Sheet s = wb.createSheet("New Sheet");
		Row row = s.createRow(0);
		
		Cell cell = row.createCell(0);
		cell.setCellValue("Thulasi");
		
		row.createCell(1).setCellValue(true);
		row.createCell(2).setCellValue("14/05/1995");
		
		CreationHelper c=wb.getCreationHelper();
		
		short format = c.createDataFormat().getFormat("MM/DD/YYYY HH:MM:SS");
		
		CellStyle cs=wb.createCellStyle();
			
		cs.setDataFormat(format);
		
		row.createCell(3).setCellStyle(cs);
		
		row.getCell(3).setCellValue(Calendar.getInstance());
		
		try(OutputStream os=new FileOutputStream("./NewFolder/NewExcelProject.xlsx")){
			wb.write(os);
		}
		catch(Exception e) {
			System.out.println("File Not Found Exception");
		}
		
		
	}

}
