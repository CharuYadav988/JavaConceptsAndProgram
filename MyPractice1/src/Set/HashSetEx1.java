package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(89);
		s.add(90);
		s.add(890);//no ordering maintained 
		s.add(14);
		s.add(null);
		s.add(null);//it will show only one null value in output
		s.add(90);//Set always stores unique element
		System.out.println(s);
		int x=s.size();
		System.out.println("Size of set is "+x);//it will not take duplicate elements
		for (Integer i:s) {
			System.out.println(i);
		}
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

}

}
