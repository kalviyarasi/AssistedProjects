package round2_assisted_pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// create file using File class
class Addfile{
	void createFile() throws IOException {
		String path="C:\\Users\\Kalviyarasi\\Documents\\round2AssistedPro\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file name");
		String filename=sc.nextLine();
		String finalpath=path+filename;
		File f=new File(finalpath);
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("file not created");
		}
		else
		{
			System.out.println("your file is created");
		}
	}
}

//create file using Fileoutputstream and write your data in the file
class fileOpStream{
	void createFile1() throws IOException {
		FileOutputStream fo=new FileOutputStream("input",true);
		if(fo!=null) {
			System.out.println("file is created in the filename input");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your data into created file=");//write your message in the file
		String str=sc.nextLine();
		//convert string into byte since fileoutputstream takes only bytes
		byte b[]=str.getBytes();
		fo.write(b);
		fo.close();
	}
	
}



public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		Addfile obj=new Addfile();
		fileOpStream obj1=new fileOpStream();
		
		obj.createFile();
		//obj1.createFile1();
	}

}
