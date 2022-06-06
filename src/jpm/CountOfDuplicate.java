package jpm;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicate {

	public static void main(String[] args) 
	{
		String str = "SumitKarmakar";
		String strL = str.toLowerCase();
		System.out.println(strL);
		countOfDup(strL);
	}
	
	public static void countOfDup(String s)
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
		
		for(Map.Entry<Character, Integer> e : map.entrySet())
		{
			System.out.println("Count of "+e.getKey()+" is: "+e.getValue());
		}
	}

}
