package sheetremoval;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SheetRemoval {

	public static void main(String[] args) {
		try {

			Workbook wb = WorkbookFactory.create(new File("workbook.xlsx"));
			System.out.println(wb.getNumberOfSheets());
			wb.removeSheetAt(1);
			System.out.println(wb.getNumberOfSheets());

			FileOutputStream fileOut = new FileOutputStream("workbook2.xlsx");
			wb.write(fileOut);
			fileOut.close();
			wb.close();
			System.out.println("sheet odstraneny");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("subor nenajdeny");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
