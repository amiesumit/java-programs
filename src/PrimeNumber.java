
public class PrimeNumber 
{

	static void isPrime(int n)
	{
		boolean prime = true;
		if (n==0||n==1)
		{
			System.out.println(n+" is not Prime");
		}
		else
		{
			for (int i = 2; i<n/2; i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not Prime");
					prime = false;
					break;
				}
								
			}
		}
		if(prime)
		{
			System.out.println(n+" is a Prime");
		}
	}
	public static void main(String[] args) 
	{
		isPrime(3);
		isPrime(11);
		isPrime(20);
	}

}
