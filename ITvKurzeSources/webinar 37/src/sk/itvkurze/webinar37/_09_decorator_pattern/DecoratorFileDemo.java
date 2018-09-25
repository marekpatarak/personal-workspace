package sk.itvkurze.webinar37._09_decorator_pattern;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorFileDemo
{
	public static void main(String[] args) throws Exception
	{
		File subor = new File("subor.txt");
		subor.createNewFile();
		
		OutputStream os = new FileOutputStream(subor);
		
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeChars("text");
		
		dos.close();
		os.close();
	}
}
