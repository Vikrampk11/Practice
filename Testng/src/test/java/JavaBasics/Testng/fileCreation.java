package JavaBasics.Testng;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class fileCreation {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		PrintWriter writer = new PrintWriter("./Attachments/the-file-name.txt", "UTF-8");
		writer.println("The  line");
		writer.println("The second line");
		writer.close();

	}

}
