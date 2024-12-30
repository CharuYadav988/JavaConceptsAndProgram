package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethod2 {

	public static void main(String[] args) {
		Map<Character,String> mp=new HashMap<Character,String>();
		mp.put('A', "January");//No ordering mainatined
		mp.put('B', "Februray");//we can give one null value to key
		mp.put('C', "March");//we can give multiple null  to Value
		mp.put('D', "April");//unique element will stored
		mp.put('E', "May");//key need to be unique,value can be duplicate
		mp.put('F', "December");
		
		Map<Character,String> mp2=new HashMap<Character,String>();
		mp2.put('A', "January");//No ordering mainatined
		mp2.put('B', "Februray");//we can give one null value to key
		mp2.put('C', "March");//we can give multiple null  to Value
		mp2.put('D', "April");//unique element will stored
		mp2.put('E', "May");//key need to be unique,value can be duplicate
		
		boolean flag=mp.equals(mp2);//all the elements from mp and mp2 should be same
		System.out.println(flag);

		boolean flag2=mp.isEmpty();
		System.out.println(flag2);
		
		mp.putAll(mp2);
		System.out.println(mp);
		
		mp.putIfAbsent('K', null);// it will check first its there in mp ,if not then it will add
		System.out.println(mp);
		
		mp.remove('F');
		System.out.println(mp);
		
		mp.replace('A', "May");
		System.out.println(mp);
	}

}
