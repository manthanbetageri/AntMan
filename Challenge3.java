package com.challenges.pckg;

import java.util.Scanner;
public class Challenge3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		printEqual(a,b,c);
	}
	public static void printEqual(int a, int b, int c)
	{
		if(a<0||b<0||c<0)
		{
			System.out.println("Invalid Value");
		}
		else if(a==b && b==c)
		{
			System.out.println("Numbers Are Equl");
		}
		else
		{
			if(a!=b && b!=c && c!=a)
			{
				System.out.println("All Are Different");
			}
			else
			{
				System.out.println("Neither all are equal or different");
			}
		}
	}
}



