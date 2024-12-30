package JavaAssignments;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;                             
		System.out.println("Enter the String");    //STRING =2h3n5
		s=sc.nextLine();
		
		int sum=0;
		for(int i=0;i<s.length();i++)       //s.length=5
		{
			if(Character.isDigit(s.charAt(i))) 
				
	//s.charAt(0)=2=That is Digit,True || s.charAt(1)=h=False || s.charAt(2)=3=That is Digit,True
	//s.charAt(3)=n=False || s.charAt(4)=5=That is Digit,True
				
					{
				int x=Character.getNumericValue(s.charAt(i));  // x=2 || x=3 || x=5
				sum=sum+x;   //0+2=2 || 2+3=5 || 5+5=10
					}
		}
		
		System.out.println("Sum of digit from String is "+sum);
		

	}

}
