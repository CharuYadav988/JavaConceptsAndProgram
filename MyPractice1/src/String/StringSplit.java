package String;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="India is my country";
 String str1[]=str.split(" ");
 for(String s:str1) //this will print the element line by line
 {
	System.out.println(s); 
 }
 System.out.println(Arrays.toString(str1)); //this will print new array in array format
	}

}
