package arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int rows,columns;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of rows");
		rows = sc.nextInt();
		System.out.println("Enter number of columns");

		columns = sc.nextInt();
		int[][] arr=new int[rows][columns];
		System.out.println("Enter array elements");

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Contents of the array is");

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
