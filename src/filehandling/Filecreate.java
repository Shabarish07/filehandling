package filehandling;

import java.io.File;
import java.io.IOException;

public class Filecreate {
	public static void main(String[] args) {
		try {
		File obj= new File("D:\\Java Workspace\\filehandling\\f1.txt");
		if(obj.createNewFile()) {
			System.out.println("file is created " +obj.getName());
		}else {
				System.out.println("file exsits");
		}
		}
		catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		

	}

}
