package arrays;

import java.util.Scanner;

public class SecondLargestEle {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
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
		// 5,10,7,8
		//first_lar = 10
		//sec_lar = 5
		int first_lar = arr[0]>arr[1]?arr[0]:arr[1];
		int sec_lar = arr[0]<arr[1]?arr[0]:arr[1];
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>first_lar)
			{
				sec_lar = first_lar;
				first_lar = arr[i];
			} else if(arr[i]>sec_lar)
			{
				sec_lar = arr[i];
			}
		}
		System.out.println("Second largest number is "+sec_lar);
		
	}

}
