package week6.day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	
	
	public static String[][] readExcel(String excelName) throws IOException {
		
	
		XSSFWorkbook wb=new XSSFWorkbook("data/"+excelName+".xlsx");
		
		XSSFSheet sheet=wb.getSheetAt(0);
				
	
		//XSSFCell cell=row.getCell(0);
		//System.out.println(cell);
		
		//total no of rows
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("The total no of rwos is "+rowcount);
		
		//total no of columns
		int columncount=sheet.getRow(0).getLastCellNum();
		System.out.println("The total no of coulmns is "+columncount);
		
		String[][] data=new String[rowcount][columncount];
		
		for(int i=1;i<=rowcount;i++) {
		
			XSSFRow row=sheet.getRow(i);
			for (int j = 0; j < columncount; j++) {
				String stringCellValue=row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
				//data[0][0]
			}
			
		}
		wb.close();
		return data;
		
		
		
		
		
	}

	
}
