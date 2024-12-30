package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		Set<String> s=new LinkedHashSet<String> ();
        s.add("India");
        s.add("China");
        s.add("UK");
        s.add("USA");
        s.add("Pakistan");
        
        System.out.println("Using for Each Loop");
        for(String s1:s)
        {
        	System.out.println(s1);
        }
        
        System.out.println("Using Iterator");
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}

}
