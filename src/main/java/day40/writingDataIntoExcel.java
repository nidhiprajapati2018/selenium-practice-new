package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFChartSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/testdata/myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1  =sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2  =sheet.createRow(1);
		row1.createCell(0).setCellValue("Python");
		row1.createCell(1).setCellValue(3);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row3  =sheet.createRow(2);
		row1.createCell(0).setCellValue("C#");
		row1.createCell(1).setCellValue(5);
		row1.createCell(2).setCellValue("Automation");
		
		workbook.write(file);
		
		workbook.close();
		
		file.close();
		
		System.out.println("file is created");
		

	}

}
