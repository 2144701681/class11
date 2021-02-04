package excelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// in write method we write the code and print in XL file but REad ids different
		
		String path = "C:\\ABC\\Java\\hello.xlsx";
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheet1 = wb.getSheetAt(0);
		
//		Row rw1 = sheet1.getRow(0);
//		Cell cl2 =rw1.getCell(1);
		int rowNum = sheet1.getPhysicalNumberOfRows();
		
		System.out.println(rowNum);
		System.out.println(sheet1.getRow(2).getPhysicalNumberOfCells());
		System.out.println(sheet1.getRow(1).getCell(1));
		
		fi.close();


	}

}
