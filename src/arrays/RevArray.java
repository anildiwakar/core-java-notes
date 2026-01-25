package arrays;

import java.util.Scanner;

public class RevArray {

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
		//some processing for reversing an array
		int start=0,end=arr.length-1,temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			}

	}

}
