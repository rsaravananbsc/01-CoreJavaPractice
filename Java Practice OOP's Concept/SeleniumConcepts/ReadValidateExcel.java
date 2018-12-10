package SeleniumConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValidateExcel {

	public static void main(String[] args) throws IOException {
		//Read From Excel File
		File srcFile = new File("./ExcelFile.xlsx");
			
		FileInputStream Fin = new FileInputStream(srcFile); 
		XSSFWorkbook wb = new XSSFWorkbook(Fin); //Login into Workbook
		XSSFSheet sheet = wb.getSheetAt(0); //Login into Sheet
		
		int sheetrow = sheet.getLastRowNum();
		for (int row = 0; row < sheetrow; row++) {
			String InStr = sheet.getRow(row).getCell(0).getStringCellValue();
			if (InStr.equalsIgnoreCase("saravanan")) {
				String header1 = sheet.getRow(0).getCell(0).getStringCellValue();
				String header2 = sheet.getRow(0).getCell(1).getStringCellValue();
				System.out.println(header1 +"\t" +header2);
				
				String value1 = sheet.getRow(row).getCell(0).getStringCellValue();
				double value2 = sheet.getRow(row).getCell(1).getNumericCellValue();
				System.out.println(value1 +"\t" +value2);	
			}
		}		
	}

}
