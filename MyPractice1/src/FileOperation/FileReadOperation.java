package FileOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadOperation {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("C:\\WorkSpace\\IS_Automation\\MavenScripts\\ConnectInfy\\NewFile.txt");
		Scanner sc =new Scanner(f);
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();
			System.out.println(s);
		}
		sc.close();

	}

}
