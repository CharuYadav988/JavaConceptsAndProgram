package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethod2 {

	public static void main(String[] args) {
		Set<String> s2=new HashSet<String>();
		s2.add("Apple");
		s2.add("Mango");
		s2.add("Pines");
		s2.add("Grapes");
		s2.add("melon");
		
		for(String s:s2) {
			System.out.println(s);
		}
		
		Set<String> s3=new HashSet<String>();
		s3.add("Apple");
		s3.add("Mango");
		s3.add("Pines");
		s3.add("Grapes");
		s3.add("cherry");
		
		for(String s:s3) {
			System.out.println(s);
		}
		
		 s2.addAll(s3);
		 System.out.println("After ADDALL Method implementation");
		 System.out.println(s2); //It will give all the element from s2,s3 removing duplicates
		 
		 s2.retainAll(s3);
		 System.out.println("After RetainAll Method implementation");
		 System.out.println(s2); // Common element it will give
		 
		 s2.removeAll(s3);
		 System.out.println("After RemoveAll Method implementation");
		 System.out.println(s2);//it will remove all element of s3 from s2
		 
		
		}

}
