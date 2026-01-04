package controlstatements;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPrime=true;
		if(num==1) {
			
		} else {
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println( num +"is Prime number ");
		}
		else
		{
			System.out.println("Not a Prime number "+ num);
		}
		}
		
	}

}
