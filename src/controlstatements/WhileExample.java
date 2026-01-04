package controlstatements;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0;
		while(n>0)
		{
			res++;
			n=n/10;
		}
		System.out.println("number of digits ="+res);
	}

}
