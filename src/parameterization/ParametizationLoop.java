package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParametizationLoop {

	
public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		
	
		System.out.println("Horizontal Output");
		
		for(int i=0; i<=3; i++) {
			
			for(int j=0; j<=4; j++) {
				
				String path = "E:\\AUTOMATION\\Excel_Sheet\\New Microsoft Excel Worksheet (2).xlsx";
				
				FileInputStream v = new FileInputStream(path);
				
				String element1 = WorkbookFactory.create(v).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(element1 +" ");
			}
			
			System.out.println();
		}
		
		
		/*System.out.println("\n" + " Vertical Output");
		
		
		for(int i=0; i<=4; i++) {
			
			for(int j=0; j<=3; j++) {
				
				String path = "E:\\AUTOMATION\\Excel_Sheet\\New Microsoft Excel Worksheet (2).xlsx";
				
				FileInputStream v = new FileInputStream(path);
				
				String element2 = WorkbookFactory.create(v).getSheet("Sheet1").getRow(j).getCell(i).getStringCellValue();
				System.out.print(element2 +" ");
			}
			
			System.out.println();
		}
	*/
		
		System.out.println("\n" + "Numeric Output");
		
		for(int k=6; k<=9; k++) {
			
			for(int l=5; l<=9; l++) {
				
				String path = "E:\\AUTOMATION\\Excel_Sheet\\New Microsoft Excel Worksheet (2).xlsx";
				
				FileInputStream v = new FileInputStream(path);
				
				double element3 = WorkbookFactory.create(v).getSheet("Sheet1").getRow(k).getCell(l).getNumericCellValue();
				System.out.print(element3 +" ");
			}
			
			System.out.println();
		}		
		
	

}
}
