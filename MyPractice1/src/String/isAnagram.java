package String;

import java.util.Arrays;

public class isAnagram {
	 public static boolean Anagram(String s1,String s2)
	 {
		String str1 = s1.replaceAll("\\s","");
		String str2= s2.replaceAll("\\s","");
		 if((s1.length())!=s2.length())
		 {
			 return false;
			
		}
		 else {
			char ch1[]= str1.toLowerCase().toCharArray();
			char ch2[]= str2.toLowerCase().toCharArray();
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			return Arrays.equals(ch1, ch2);
			 
		 }
		 
		 
	 }

	public static void main(String[] args) {
		System.out.println(Anagram("Brag","Grab"));

	}

}
