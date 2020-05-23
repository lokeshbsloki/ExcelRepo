package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public ExcelUtils(String excelpath, String sheetName) {
	
		 try {
			workbook = new XSSFWorkbook(excelpath);
			 sheet =workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) throws Exception {
		
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	public static void getRowCount()   {
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("total no of rows = "+rowCount);
	}
	
	public static void getCellDataNumber(int rowNum, int colNum) {
		 
		  double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		 System.out.println("cell data is = "+celldata);
	 
	}
	
	public static void getCellDataString(int rowNum, int colNum) {
		 
		 String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		 System.out.println("cell data is = "+celldata);
	 
	}
}
