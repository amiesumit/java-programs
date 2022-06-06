package String;

public class StringReverse 
{

	public static String strRev(String in)
	{
		String rev = "";
		for (int i=in.length()-1; i >=0; i--)
		{
			rev+=in.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) 
	{
		String str = "sumitkarmakar";
		System.out.println("String after reverse is " +strRev(str));

	}

}
