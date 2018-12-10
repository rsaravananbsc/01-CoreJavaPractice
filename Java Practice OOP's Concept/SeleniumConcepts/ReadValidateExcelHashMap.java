package SeleniumConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValidateExcelHashMap {

	public static void main(String[] args) throws IOException {
		//Read From Excel File
		File srcFile = new File("./ExcelFile.xlsx");
			
		FileInputStream Fin = new FileInputStream(srcFile); 
		XSSFWorkbook wb = new XSSFWorkbook(Fin); //Login into Workbook
		XSSFSheet sheet = wb.getSheetAt(0); //Login into Sheet
		
		HashMap <String, String> supermap = new HashMap<String, String>();
		
		int rowcount = sheet.getLastRowNum();
		for (int row = 0; row < rowcount; row++) {
			String InStr = sheet.getRow(row).getCell(0).getStringCellValue();
			if (InStr.equalsIgnoreCase("saravanan")) {
				String key = sheet.getRow(row).getCell(0).getStringCellValue();
				String value = sheet.getRow(row).getCell(1).getStringCellValue();
				supermap.put(key, value);
			}
		}
		
		System.out.println(supermap);
	
	}
}
