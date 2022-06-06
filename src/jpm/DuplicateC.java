package jpm;

import java.util.HashMap;
import java.util.Map;

public class DuplicateC {

	public static void main(String[] args) 
	{
		String str = "sumitkarmakar";
		duplicateC(str);

	}
	
	public static void duplicateC(String s)
	{
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> e:map.entrySet())
		{
			System.out.println("Character: "+e.getKey()+" - Count: "+e.getValue());
		}
		
	}

}
