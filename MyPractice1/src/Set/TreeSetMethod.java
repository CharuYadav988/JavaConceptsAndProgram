package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethod {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>();
		//If u want to store the element in ascending order use TreeSet
		//You can give in any order tree set will sort it in ascending order
		tree.add("A");
		tree.add("B");
		tree.add("F");
		tree.add("C");
		tree.add("D");
		tree.add("E");
	
		System.out.println("Using For-each loop");
		for(String s:tree)
		{
			System.out.println(s);
		}
		
		System.out.println("Iterator to iterate");
		Iterator itr=tree.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
