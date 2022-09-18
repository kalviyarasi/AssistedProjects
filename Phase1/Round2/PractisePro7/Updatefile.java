package round2_assisted_pro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Updatefile {
	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("input");
		FileOutputStream fo=new FileOutputStream("output",true);
		
		if(fi!=null) {
			System.out.println("your file exists");
		}
		int i=0;
		while((i=fi.read())!=-1) {
			fo.write(i);
		}
		fi.close();
		fo.close();
		
	}

}
