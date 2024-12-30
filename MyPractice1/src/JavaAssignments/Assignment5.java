package JavaAssignments;

public class Assignment5 {

	public static void main(String[] args) {
		String s1="ABCD";
		String s2="CDAB";
		
		if(s1.length()!=s2.length()) //s1=ABCD=4  s2=CDAB=4  Condition Fails
		{
			System.out.println("Not A Rotation");
		}
		
		String s3=s1+s1;  //s3=ABCDABCD
		/* indexOf--->if s2=CDAB is present in s3=ABCDABCD then it will return index 2
		 * but incase its not present then it will return -1
		 * to print the indexof you can use System.out.println(s3.indexOf(s2));
		 * */
		System.out.println(s3.indexOf(s2));
		if(s3.indexOf(s2)!=-1)   
		{
			System.out.println("String 2 is a Rotation of String 1");
		}
		else
		{
			System.out.println("Not A Rotation");
		}	
		

	}

}
