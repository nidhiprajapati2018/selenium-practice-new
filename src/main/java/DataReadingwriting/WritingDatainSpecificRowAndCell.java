package DataReadingwriting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDatainSpecificRowAndCell {

	public static void main(String[] args) throws FileNotFoundException {
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/testdata/myfile_Random.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("DynamicData");

		XSSFRow row = sheet.createRow(3);
		XSSFCell cell = row.createCell(4);

		cell.setCellValue("welcome");

	}

}
