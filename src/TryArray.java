import java.util.Scanner;

public class TryArray {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
//		scanner.close();
		
		int[] a = new int[n];
		
		for (int i=0;i<n;i++)
		{
			a[i]= scanner.nextInt();
		}
		scanner.close();
		
		//print array
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
