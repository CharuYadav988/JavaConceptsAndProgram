package FileOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ToAppendTheContentFile {

	public static void main(String[] args) throws IOException {
		String s="C:\\WorkSpace\\IS_Automation\\MavenScripts\\ConnectInfy\\NewFile.txt";
		BufferedWriter br=new BufferedWriter(new FileWriter(s,true));
		br.write(" is a language");		
        br.close();
	}

}
