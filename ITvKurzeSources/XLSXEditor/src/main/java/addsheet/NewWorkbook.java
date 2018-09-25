package addsheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewWorkbook {

	public static void main(String[] args) {
		try {
			Workbook wb = new XSSFWorkbook();
			Sheet sheet1 = wb.createSheet("new sheet");
			Sheet sheet2 = wb.createSheet("second sheet");

			FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
			wb.write(fileOut);
			fileOut.close();
			wb.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("subor nenajdeny");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
