package com.challenges.pckg;

public class Challenge2 {
	public static double area(double radius) {
		if(radius<0)
			return -1.0;
		else
			return Math.PI *radius*radius;
	}
	public static double area(double x,double y)
	{
		if(x<0 || y<0)
		{
			return -1.0;
		}
		else
		{
			return x*y;
		}
	}
	public static void main(String[] args) {
		System.out.println(area(12));
		System.out.println(area(-2));
		System.out.println(area(-35.0,-40));
		System.out.println(area(-2.0,30));
		System.out.println(area(4.0,5.0));
	}
}

	


