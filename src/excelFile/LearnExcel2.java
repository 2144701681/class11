package excelFile;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel2 {

	public static void main(String[] args) {
	
		
		// Excel: workbook,worksheet,cell - (cell meanrow and col)
		
		// .xls - HSSF Api
	// .xls, .xlsx -XSSF Api
		
		XSSFWorkbook wb =new XSSFWorkbook();
		XSSFSheet ws1 =wb.createSheet("James");
		
		
		
		

	}

}
