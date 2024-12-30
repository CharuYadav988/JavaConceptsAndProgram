package Set;

import java.util.TreeSet;

public class TreeSetMethod2 {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>();
		//If u want to store the element in ascending order use TreeSet
		tree.add("A");
		tree.add("B");
		tree.add("C");
		tree.add("D");
		tree.add("E");
		tree.add("F");
		
		System.out.println("Elements of treeSet--> "+tree);
		
		System.out.println("It will print the element in Descending order--> "+tree.descendingSet());
		
		System.out.println("Head set is --> "+tree.headSet("E"));//This will not take E 
		
		System.out.println("Head set is --> "+tree.headSet("E",true));//This will take E as well
		
		System.out.println("Tail set is --> "+tree.tailSet("E",false));//This will not take E if we give false
		
		System.out.println("Tail set is --> "+tree.tailSet("E"));//it will take E or u can give true
		
		System.out.println("subSet set is --> "+tree.subSet("E","F"));
	}

}
