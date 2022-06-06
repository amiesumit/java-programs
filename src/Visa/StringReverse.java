package Visa;

public class StringReverse {

	public static void main(String[] args) 
	{
		String str = "sumitkarmakar";
		System.out.println(strRev(str));
	}
	
	public static String strRev(String str)
	{
		String revStr = "";
		
		for (int i = str.length()-1; i>=0;i--)
		{
			revStr += str.charAt(i);
		}
		return revStr;
	}

}
