package filehandling;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class Fileread {

	public static void main(String[] args) {
		try {
		File x= new File("D:\\Java Workspace\\filehandling\\f1.txt");
		Scanner Reader = new Scanner(x);
		while(Reader.hasNextLine()) {
			String data=Reader.nextLine();
			System.out.println(data);
		}
		Reader.close();
		}
		catch(IOException e)
		{
			System.out.println("error occured");
			e.printStackTrace();
		}

	}

}
