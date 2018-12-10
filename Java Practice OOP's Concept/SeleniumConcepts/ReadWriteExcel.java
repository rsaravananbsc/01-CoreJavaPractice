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

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException {
		//Read From Excel File
		File srcFile = new File("./ExcelFile.xlsx");
		File dstFile = new File("./ExcelFile.xlsx");
		
		FileInputStream Fin = new FileInputStream(srcFile); 
		XSSFWorkbook wb = new XSSFWorkbook(Fin); //Login into Workbook
		XSSFSheet sheet = wb.getSheetAt(0); //Login into Sheet
		
		//Accessing Data from Excel Single Rows,Columns 
		System.out.print(sheet.getRow(0).getCell(0).getStringCellValue()+"\t"); //Accessing Rows & Columns
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue()); //Accessing Rows & Columns
		
		System.out.println("_________________________________________________");
		
		
		//Read from Excel File using Iterator for all the Rows,Columns
		DataFormatter dataFormatter = new DataFormatter();
		for (Row row: sheet) {
            for(Cell cell: row) {
				String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }
		
		//Read from Excel File for all the Rows,Columns
		System.out.println("Method2");
		
		int countrow = sheet.getLastRowNum();
	
		for (int row = 0; row < countrow; row++) {
			short countcol = sheet.getRow(row).getLastCellNum();
				for (int j = 0; j < countcol; j++) {
					String value1 = sheet.getRow(countrow).getCell(countcol).getStringCellValue();
					String value2 = sheet.getRow(countrow).getCell(countcol).getStringCellValue();
					System.out.println(value1 +"\t" +value2);
				}
		}
				
	
		
		//Write To Excel File
		FileOutputStream Fout = new FileOutputStream(dstFile);
		
		sheet.getRow(0).createCell(0).setCellValue("FriendsName");
		sheet.getRow(0).createCell(1).setCellValue("AmountValue");
		
		wb.write(Fout);
		Fout.close();
		
	}

}
