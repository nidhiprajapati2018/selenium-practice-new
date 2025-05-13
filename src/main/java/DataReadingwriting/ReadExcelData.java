package DataReadingwriting;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class ReadExcelData {

	public static void main(String[] args) throws InvalidFormatException {
		 //String filePath = "path/to/your/excel/file.xlsx";

	        try (FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"/testdata/data.xlsx");) {
	            // Create Workbook instance for the Excel file
	            Workbook workbook = WorkbookFactory.create(inputStream);

	            // Get the first sheet
	            Sheet sheet = workbook.getSheetAt(0);

	            // Iterate through the rows and cells
	            for (Row row : sheet) {
	                for (Cell cell : row) {
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            // String cell
	                            System.out.print(cell.getStringCellValue() + "\t");
	                            break;

	                        case NUMERIC:
	                            // Check if the cell is a date
	                            if (DateUtil.isCellDateFormatted(cell)) {
	                                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	                                System.out.print(dateFormat.format(cell.getDateCellValue()) + "\t");
	                            } else {
	                                // Numeric value
	                                System.out.print(cell.getNumericCellValue() + "\t");
	                            }
	                            break;

	                        case BOOLEAN:
	                            // Boolean cell
	                            System.out.print(cell.getBooleanCellValue() + "\t");
	                            break;

	                        case FORMULA:
	                            // Formula cell
	                            System.out.print(cell.getCellFormula() + "\t");
	                            break;

	                        case BLANK:
	                            // Blank cell
	                            System.out.print("BLANK\t");
	                            break;

	                        default:
	                            System.out.print("UNKNOWN TYPE\t");
	                            break;
	                    }
	                }
	                System.out.println(); // New line after each row
	            }

	            // Close the workbook
	            workbook.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }


	}
}


