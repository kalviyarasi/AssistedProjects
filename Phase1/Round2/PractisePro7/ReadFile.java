package round2_assisted_pro;

import java.io.FileInputStream;
import java.io.IOException;
//in this program file is read using fileinputstream
//read can also be done by replacing FileInputStream to "FileReader"
public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("input");
		if(fi!=null) {
			System.out.println("file is found");
		}
		int i=0;
		while((i=fi.read())!=-1) {
			System.out.println((char)i);
		}
	}

}
