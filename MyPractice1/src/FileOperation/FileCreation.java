package FileOperation;


import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
	
        File f =new File("C:\\WorkSpace\\IS_Automation\\MavenScripts\\ConnectInfy\\NewFile.txt");
        boolean flag=f.createNewFile();
        System.out.println(flag);
        //If you run the same program again it will show false.
        
        //To check if the file exists or not
        
        boolean flag2=f.exists();//if we delete the file then file will not exists it will show false.
        System.out.println("Is file exists or not "+flag2);
        
        // to get the absolute path of file
        String path=f.getAbsolutePath();
        System.out.println("path is "+path);
        
        //to check if we can read or write in file 
        boolean flag3=f.canRead();
        System.out.println("can we read the file "+flag3);
        
        boolean flag4=f.canWrite();
        System.out.println("can we write the file "+flag4);
        
        // to check the lenght of file
        long len=f.length();
        System.out.println("Length of the file is "+len);
        }

}
