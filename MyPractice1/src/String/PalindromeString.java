package String;

public class PalindromeString {
	
	public static boolean palindrome(String s1)

	{
		s1=s1.toLowerCase();
		
		String revstr="";
		
		
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			revstr=revstr+s1.charAt(i);
		}
		
		
		
	return revstr.equals(s1);
		
		
	}

	public static void main(String[] args) {
		
System.out.println(palindrome("Nitin"));
}
}
