package round2_assisted_pro;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file name to delete");
		String filename=sc.nextLine();
		String path="C:\\Users\\Kalviyarasi\\Documents\\round2AssistedPro\\";
		String finalpath=path+filename;
		File f=new File(finalpath);
		f.delete();
		System.out.println("your file has been deleted");
		
	}

}
