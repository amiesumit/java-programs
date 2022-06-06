package oop;

public class methodOverloading {
	public float add(int a, int b)
	{
		System.out.println("method 1");
		return a+b;
	}

	public float add(float a, float b)
	{
		System.out.println("method 2");
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		methodOverloading m = new methodOverloading();
		
//		m.add(2, 3);
		System.out.println(m.add(2.3F, 3.5F));
	}

}
