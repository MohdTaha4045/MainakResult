package generic_utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public String RExcel(String SheetName, int rNum, int cNum){
		String data ="";
		int data2 =0;
		String data3="";
		try {
			try {
			FileInputStream fis = new FileInputStream(".\\excel data\\Book1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet("Sheet1");
			Row r =s.getRow(rNum);
			Cell c = r.getCell(cNum);
			data = c.getStringCellValue();
			}
			catch(IllegalStateException ex) {
				FileInputStream fis = new FileInputStream(".\\excel data\\Book1.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				Sheet s = wb.getSheet("Sheet1");
				Row r =s.getRow(rNum);
				Cell c = r.getCell(cNum);				
				data2 = (int) c.getNumericCellValue();
				data3=Integer.toString(data2);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return data+data3;
	}

}
