package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Parameteraization1 {
	public static void main(String[]args) throws IOException {
		
		String Excelpath = " C:\\Users\\Admin\\Desktop\\ExcelSheet1.xlsx";
		
		FileInputStream inputstream = new FileInputStream(Excelpath);// this class will read and write excel
		
		
		XSSFWorkbook Workbook = new XSSFWorkbook(inputstream);
		
		XSSFSheet Sheet =Workbook.getSheet("Sheet1");
				
				int RowCount = Sheet.getLastRowNum();
				System.out.println(RowCount);
				
				int ColCount = Sheet.getRow(0).getLastCellNum();
				System.out.println(ColCount);
				
				
				for(int r= 0;r<=RowCount;r++) {
					
					XSSFRow Row1 = Sheet.getRow(r);
					
					for(int c = 0;c<=ColCount;c++) {
						
						XSSFCell Cell = Row1.getCell(c);
						
						
						
						switch(Cell.getCellType()) {
						
						case STRING: System.out.println();
							
							break;
							
						case NUMERIC: System.out.println();
						break;
						
						case BOOLEAN:System.out.println(Cell.getNumericCellValue());
						break;
						
						default:System.out.println("Hello");
						
							
						}
						
						System.out.println("  |  ");
					}
					System.out.println();
					
			
					
					
					
					
				}
				
				
				
				
				

		
	}

}
