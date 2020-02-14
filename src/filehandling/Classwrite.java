package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Classwrite {

	public static void main(String[] args)
	{	
		try {
		FileWriter x =new FileWriter("D:\\Java Workspace\\filehandling\\f1.txt");
		x.write("my age is 23");
		x.close();
		System.out.println("succesfully inserted");
		}
		catch(IOException e)
		{
			System.out.println("error occured");
			e.printStackTrace();
		}
	}
}
