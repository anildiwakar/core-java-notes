package arrays;

import java.util.Scanner;

public class PallenArray {

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
		int start = 0,end=arr.length-1,l_sum=0,r_sum=0;
		while(start<=end)
		{
			if(start==end)
			{
				if(l_sum==r_sum)
				{
					System.out.println(start);
				}
				else
				{
					System.out.println(-1);
				}
				break;
			} else
			{
				if(l_sum<r_sum)
				{
					l_sum=l_sum+arr[start];
					start++;
				} else if(r_sum<l_sum)
				{
					r_sum=r_sum+arr[end];
					end--;
				} else
				{
					l_sum=l_sum+arr[start];
					r_sum=r_sum+arr[end];
					start++;
					end--;
				}
				
			}
		}
	}

}
