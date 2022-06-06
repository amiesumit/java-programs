package jpm;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCount {

	public static void main(String[] args) 
	{
		String str = "SumitsKarmakar";
		String strLower = str.toLowerCase();
		coundOccurence(strLower);
	}
	
	public static void coundOccurence(String str)
	{
			
		char[] charArr = str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char c: charArr)
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
		
		for(Map.Entry<Character, Integer> e: map.entrySet())
		{
			System.out.println("Key "+e.getKey()+" Value: "+e.getValue());
		}
	}

}
