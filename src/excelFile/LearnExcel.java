package excelFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {

         //.xls - HSSF Api
		//.xls, .xlsx -XSSF Api

		 //Excel: workbook,worksheet,cell - (cell meanrow and col)
		// XSSF dealing with workbook,these are comming from jarFile so we crate JarFile

		String path = "C:\\ABC\\Java\\hello.xlsx";
		File f = new File(path);
		FileOutputStream fo = new FileOutputStream(f);

//		XSSFWorkbook wb =new XSSFWorkbook();
//		XSSFSheet ws1 = wb.createSheet("RandomNumbers");
//		Row rw5= ws1.createRow(4);
//		Cell cl4 =rw5.createCell(3);
//		cl4.setCellValue(getRandomNumberInRange(100,500));

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws1 = wb.createSheet("RandomNumbers");

//	Row rw1= ws1.createRow(0);
//	Cell cl1 =rw5.createCell(0);
//	cl4.setCellValue("No");

		ws1.createRow(0).createCell(0).setCellValue("No");
		ws1.getRow(0).createCell(1).setCellValue("Digit");
//	
//	ws1.createRow(1).createCell(0).setCellValue(1);
//	ws1.createRow(1).createCell(1).setCellValue(123);
//	
//	ws1.createRow(0).createCell(0).setCellValue(2);
//	ws1.createRow(0).createCell(1).setCellValue(432);
//	
//	ws1.createRow(3).createCell(0).setCellValue(3);
//	ws1.createRow(3).createCell(1).setCellValue(342);
//	
		for (int i = 0; i <= 500; i++) {
			ws1.createRow(i).createCell(0).setCellValue(1);
			ws1.getRow(i).createCell(1).setCellValue(getRandomNumberInRange(100, 999));

		}

		wb.write(fo);
		wb.close();

		// File
		// Fileoutput(if u want to write fileoutput,if want to read fileinput)
		// saving

	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
