package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethod {

	public static void main(String[] args) {
		Map<Character,String> mp=new HashMap<Character,String>();
		mp.put('A', "January");//No ordering mainatined
		mp.put('B', "Februray");//we can give one null value to key
		mp.put('C', "March");//we can give multiple null  to Value
		mp.put('D', "April");//unique element will stored
		mp.put('E', "May");//key need to be unique,value can be duplicate
		mp.put(null, "June");
		mp.put(null, "July");
		mp.put('G', null);
		mp.put('H', null);
		mp.put('E', "May");
		
		System.out.println(mp);// whatever it will print we cannot use any operation on it
		
	int x=	mp.size();//Give the size ignoring the duplicates;
	System.out.println("Size of hashMap "+x);
	
	String val=mp.get('G');
	System.out.println("Value for Key 'G' "+val);
	
//To iterate through HashMap
	System.out.println("Iterating through HashMap");
	for(Map.Entry s:mp.entrySet())
	{
		System.out.print(s.getKey()+" ");
		System.out.println(s.getValue()+" ");
	}
		
	}

}
