package hackerman.introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HasNextIOTester {

	public static void main(String[] args) {
		// citanie zo suboru

		try {
			InputStream fis = new FileInputStream("C:/workspace/HackerMan/src/hackerman/introduction/EOFInput2.txt");
			Scanner scan = new Scanner(fis);
			List<String> list = new ArrayList<>();

			while (scan.hasNextLine()) {
				list.add(scan.nextLine());
			}

			// zapisovanie do suboru

			PrintWriter fos = new PrintWriter("C:/workspace/HackerMan/src/hackerman/introduction/EOFOutput.txt");
			for (int i = 0; i < list.size(); i++) {
				fos.println((i + 1) + " " + list.get(i));
			}
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
