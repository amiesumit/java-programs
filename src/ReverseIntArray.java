
public class ReverseIntArray {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		revArr(arr, arr.length);
	}
	
	public static void revArr(int arr[], int l)
	{
		int [] rev = new int[l];
		int j = l;
		for(int i = 0; i<arr.length;i++)
		{
			rev[j-1]=arr[i];
			j--;
		}
		System.out.println("Reversed array is: \n");
		for (int i = 0; i<arr.length;i++)
		{
			System.out.println(rev[i]);
		}
	}

}
