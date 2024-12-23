package ArrayList;

import java.util.ArrayList;

public class ArrayListMethod2 {

	public static void main(String[] args) {
		ArrayList<Object> obj=new ArrayList<Object>();
		//Object we use to add multiple element of different data type
		obj.add("Hello");
		obj.add(67);
		obj.add(" ");
		obj.add(null);
		obj.add(true);
		obj.add(9.89f);
		
		for(Object o:obj)
		{
			System.out.println(o);
		}
		
		obj.add(2,"Like");//adding new element at 2 index;the existing 2 index element will shift to next index
		System.out.println("After adding new element at the provided index");
		for(Object o:obj)
		{
			System.out.println(o);
		}
		System.out.println("After setting new element at the provided index");
		obj.set(3, 2002);//it will set the element at tht index;but the existing element will be excluded
		for(Object o:obj)
		{
			System.out.println(o);
		}
		System.out.println("After clearing the list");
		obj.clear();//clear the whole list
		for(Object o:obj)
		{
			System.out.println(o);
		}
	}

}
