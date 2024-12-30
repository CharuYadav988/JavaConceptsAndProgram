package JavaAssignments;

public class Assignment7 {

	public static void main(String[] args) {
		String s="Hello my name is Jack";
		int ccount=0;
		int vcount=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{    //Vowels will be check here
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vcount++;  //vowel count increment
			}
			//consonant will be check here
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				ccount++; //consonant count increment
			}
				
		}
		 System.out.println("Number of vowels: " + vcount);    
	        System.out.println("Number of consonants: " + ccount);  
    }    
}


