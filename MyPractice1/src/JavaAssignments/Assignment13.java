package JavaAssignments;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment13 {

	public static void main(String[] args) {
		String s1;
		String s2;
		
		Scanner sc=new Scanner(System.in); //To Take Input from User
		System.out.println("Enter string 1");
		s1=sc.nextLine();                    //String s1=Brag
		System.out.println("Enter string 2");  //String s2=Br ag
		s2=sc.nextLine();
		
		s1=s1.replaceAll(" ",""); //String s1=Brag
		s2=s2.replaceAll(" ",""); //String s2=Brag
		
		if(s1.length()!=s2.length())   //s1.lenghth=s2.length=4;condition fails 
		{
			System.out.println("Not a Anagram");
		}
		else
		{
			char ch1[]=s1.toLowerCase().toCharArray(); //b,r,a,g
			char ch2[]=s2.toLowerCase().toCharArray(); //g,r,a,b
			
			Arrays.sort(ch1);  //a,b,g,r
			Arrays.sort(ch2);  //a,b,g,r
			
			boolean flag = Arrays.equals(ch1, ch2);   //a,b,g,r=a,b,g,r;result=true
			if(flag==true)
			{
				System.out.println("Strings are Anagram");
			}
			else
			{
				System.out.println("Strings are not Anagram");
			}
		}
	}

	}


