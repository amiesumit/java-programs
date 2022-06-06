package oop;

abstract class Abs
{
	abstract void run();
	
}

class AbstractClass extends Abs
{
	void run()
	{
		System.out.println("hello world");
	}
//	void run(String a)
//	{
//		System.out.println(a);
//	}
	
	

	public static void main(String[] args) 
	{
	
		Abs a = new AbstractClass();
		a.run();
		
	}

}
