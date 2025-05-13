package DataReadingwriting;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFormExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/testdata/data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1");
		 int totalRows = sheet.getLastRowNum();
		
        int totalCells = sheet.getRow(1).getLastCellNum();

		System.out.println("Number of rows: "+ totalRows);
		System.out.println("Number of column: "+ totalCells);

		for(int r=0; r<=totalRows; r++) {
			XSSFRow currentRow = sheet.getRow(r);

			for(int c=0;c<totalCells; c++){
				XSSFCell currentCell = currentRow.getCell(c);
				CellType cellType = currentCell.getCellType();
				
				
				
				switch (cellType) {
				case STRING:
					System.out.print(currentCell.getStringCellValue()+ "\t");
					break;
				case NUMERIC:
					   if (DateUtil.isCellDateFormatted(currentCell)) {
                           SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                           System.out.print(dateFormat.format(currentCell.getDateCellValue()) + "\t");
                       } else {
                           // Numeric value
                           System.out.print(Integer.toString((int)currentCell.getNumericCellValue()) + "\t");
                       }
					
					break;
				case BOOLEAN:
					System.out.println(currentCell.getBooleanCellValue()+ "\t");
					break;
				
				//System.out.print(currentCell.toString()+"\t");
				//System.out.print(currentCell.getStringCellValue()+"\t");

			}
				
			}
			System.out.println();
		}

	workbook.close();
	file.close();

	}

}
