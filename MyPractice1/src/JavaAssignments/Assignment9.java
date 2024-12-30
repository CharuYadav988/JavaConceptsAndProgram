package JavaAssignments;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the string");
	    s=sc.nextLine();                   //black box is a black box
	    s=s.toLowerCase();                 //black box is a black box
		int count;
		String s1[]=s.split(" ");           // black,box,is,a,black,box
		System.out.println("Duplicates word in String are ");
		for(int i=0;i<s1.length;i++)        //i=0;0<6(T); i=1;1<6(T)
		{  count=1;
			for(int j=i+1;j<s1.length;j++)  //J=1,1<6(T);J=1,1<6(T);J=2,3,4,5 corresponds to i=0
			{                               //J=2,2<6(T);J=3,4,5 corresponds to i=1
				
				if(s1[i].equals(s1[j]))   
					//black=box(F);black=is(F);black=a(F);black=black(T);black=box(F)
					//box=is(F);box=a(F);box=0(F);box=box(T)
				{
					count++;  //count=2;    count=2;
					s1[j]="0"; //s1[4]=black=black box is a 0 box 
					//s1[5]=box=black box is a 0 0
					
				}
			}
			if(count>1 && s1[i]!="0")  //2>1&&s1[0]=black!=0 //2>1&&s1[1]=box!=0
			{
				System.out.println(s1[i]);//black box
			}
		}

	}

}
