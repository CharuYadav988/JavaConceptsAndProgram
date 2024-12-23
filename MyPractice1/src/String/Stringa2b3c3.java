package String;

public class Stringa2b3c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input-a2b3c3
		//output-aabbbccc
		
		String s= "a2b3c3";
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
			}
			else {
				int x=Character.getNumericValue(s.charAt(i));
				for(int j=1;j<x;j++)
				{
					System.out.print(s.charAt(i-1));
				}
			}
		}
		

	}

}
