package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet1 {
	
	public static void main (String[]args) throws EncryptedDocumentException, IOException {
		
		String path = "C:\\Users\\Admin\\Desktop/Excelsheet.xlsx";
		
		FileInputStream Data = new FileInputStream(path);
		
		boolean data1 = WorkbookFactory.create(Data).getSheet("Sheet2").getRow(1).getCell(0).getBooleanCellValue();
		
		System.out.println(data1);		
	}

}
