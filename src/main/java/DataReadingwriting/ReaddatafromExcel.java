package DataReadingwriting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddatafromExcel {

	public static void main(String[] args) throws IOException {
		
		//Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"/testdata/data.xlsx");
	    
	    Workbook excelWorkbook = null;
	    
	    excelWorkbook = new XSSFWorkbook(inputStream);  //If it is xlsx file then create object of XSSF Workbook class
        Sheet excelSheet = excelWorkbook.getSheet("Sheet1"); //Read sheet inside the workbook by its name
	   
        //Find number of rows in excel file
	    int rowCount = excelSheet.getLastRowNum();
	    
	    //System.out.println(excelSheet.getLastRowNum());
	    //System.out.println(excelSheet.getFirstRowNum());
	    //Create a loop over all the rows of excel file to read it
	    for (int i = 0; i < rowCount+1; i++) {
	         Row row = excelSheet.getRow(i);
	        //Create a loop to print cell values in a row
	        for (int j = 0; j < row.getLastCellNum(); j++) {
	            //Print excel data in console
	            System.out.print(row.getCell(j).toString()+"|| " );
	            //System.out.print(currentCell.toString()+"\t");
	        }
	        System.out.println();
	    }
	 
	  }
}


	


