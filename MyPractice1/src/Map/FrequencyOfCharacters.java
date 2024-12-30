package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		String s1="Hello";
		char ch[]=s1.toCharArray();
		
		Map<Character,Integer> mp=new LinkedHashMap<Character,Integer>();
		
		for(Character c:ch)
		{
			if(mp.containsKey(c))
			{
				mp.put(c,(mp.get(c)+1));
			}
			else
			{
				mp.put(c, 1);
			}
		}
		
	for(Map.Entry z:mp.entrySet())
	{
		System.out.print(z.getKey()+" ");
		System.out.println(z.getValue());
	}
	
	int maxFrequency=0;
	char maxOccurrence=' ';
	
	for(Map.Entry<Character,Integer> z:mp.entrySet())
	{
		if(z.getValue()>maxFrequency)
		{
			maxFrequency=z.getValue();
			maxOccurrence=z.getKey();
		}
	}
	System.out.println("Most occured character "+maxOccurrence+" with value "+maxFrequency);
		
		
	int minFrequency=100;
	char minOccurrence=' ';
	
	for(Map.Entry<Character,Integer> z:mp.entrySet())
	{
		if(z.getValue()<minFrequency)
		{
			minFrequency=z.getValue();
			minOccurrence=z.getKey();
		}
	}
	System.out.println("Most occured character "+minOccurrence+" with value "+minFrequency);
}
	
}
