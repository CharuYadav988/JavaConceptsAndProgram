package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethod3 {

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
		
		boolean flag=s2.contains("Apple");
		System.out.println("Contains true/false "+flag);
		boolean flag2=s3.containsAll(s2);
		System.out.println("ContainsAll true/false "+flag2);
		
		s2.remove("melon");
		System.out.println(s2);
		
		Object obj[]=s2.toArray();
		for(Object s:obj)
		{
			System.out.println(s);
		}
	}

}
