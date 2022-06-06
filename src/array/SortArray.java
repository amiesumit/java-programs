package array;

import java.util.Scanner;

public class SortArray 
{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int[] myArr = getArray(5);
		int[] sorted = sortedArr(myArr);
		printArr(sorted);
	}

	public static int[] getArray(int cap)
	{
		int[] arr = new int[cap];
		System.out.println("Enter the element of the array: \r");
		for (int i=0; i<arr.length;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		return arr;
	}

	public static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static int[] sortedArr(int[] arr)
	{
		int[] sortedArr = new int[arr.length];
		for(int i = 0;i<arr.length;i++)
		{
			sortedArr[i]=arr[i];
		}
		
		boolean flag = true;
		int temp;
		while(flag)
		{
			flag = false;
			for(int i=0;i<sortedArr.length-1;i++)
			{
				if(sortedArr[i]>sortedArr[i+1])
				{
					temp = sortedArr[i];
					sortedArr[i]=sortedArr[i+1];
					sortedArr[i+1]=temp;
					flag=true;
				}
			}
		}
		return sortedArr;
	}
}
