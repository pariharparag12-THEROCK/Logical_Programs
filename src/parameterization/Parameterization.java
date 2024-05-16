package parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		String path = "E:\\AUTOMATION\\Excel_Sheet\\New Microsoft Excel Worksheet.xlsx";
		
		FileInputStream v = new FileInputStream(path);
		
		//String element1 = WorkbookFactory.create(v).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		//System.out.println(element1);
		
		double element2 = WorkbookFactory.create(v).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	
		System.out.println(element2);
		
		
	//	CellType element3 = WorkbookFactory.create(v).getSheet("Sheet1").getRow(0).getCell(2).getCellType();
		//System.out.println(element3);
		
		
	}

}
