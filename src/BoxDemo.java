public class BoxDemo 
{

	public static void main(String[] args) 
	{
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.bredth = 5;
		box1.length = 6;
		
		int area = box1.bredth * box1.length;
		System.out.println(area);
	}

}
