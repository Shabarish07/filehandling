package filehandling;

import java.io.File;

public class Fileinfo 
{	
	public static void main(String args[])
	{
		File x= new File("D:\\Java Workspace\\filehandling\\f1.txt");
		if(x.exists())
		{
			System.out.println("file name " +x.getName());
			System.out.println("writable " +x.canWrite());
			System.out.println("readable " +x.canRead());
			System.out.println("Path" +x.getAbsolutePath());
			System.out.println("size " +x.length());
					}
		else {
				System.out.println("file not exist");
		}
		}
	

}
