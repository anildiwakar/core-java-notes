package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array elements of size ="+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Contents in the given array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the target element");
		int target = sc.nextInt();
		boolean isPresent = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				isPresent = true;
				break;
			} 
		}
		if(isPresent)
		{
			System.out.println("Element is present in the array");
		} else {
			System.out.println("Element is not present in the array");

		}
	
	}

}
