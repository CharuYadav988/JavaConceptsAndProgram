package ExceptionalHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ThrowException2 {

	public static void FileCase(boolean flag) throws FileNotFoundException{
		// TODO Auto-generated method stub
		//need to give this path otherwise will throw error C:\\WorkSpace\\IS_Automation\\MavenScripts\\ConnectInfy\\uploads\\Test.docx
		//under uploads section need to upload file then access it.
		if(flag==true) 
		{
		 FileReader f = new FileReader("C:\\WorkSpace\\IS_Automation\\MavenScripts\\ConnectInfy\\uploads\\Test.docx");  
	        BufferedReader br = new BufferedReader(f);
	        System.out.println("You are eligible");
	       
     	}
		else
		{
			throw new FileNotFoundException("Not found file");
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		ThrowException2.FileCase(true);
	}
}


