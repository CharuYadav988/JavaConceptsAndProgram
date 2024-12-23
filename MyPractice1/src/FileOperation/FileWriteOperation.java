package FileOperation;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter f=new FileWriter("C:\\WorkSpace\\IS_Automation\\MavenScripts\\ConnectInfy\\NewFile.txt");
		f.write("Java");
		f.close();
		
	}

}
