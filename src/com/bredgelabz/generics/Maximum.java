package com.bredgelabz.generics;
import java.util.Scanner;


public class Maximum {
	/*
	 * UC1 : Given 3 Integers find the maximum
	 */
	public int largestInt(Integer x,Integer y,Integer z) 
	{
		if(x.compareTo(y) > 0 && x.compareTo(z) > 0)
		{
			return x;
		}
		else if(y > z)
		{
			return y;
		}
		else
		{
			return z;
		}

	}
	public static void main(String[] args) {
		Integer x, y, z;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first integer number:");
		x = s.nextInt();
		System.out.print("Enter the second integer number:");
		y = s.nextInt();
		System.out.print("Enter the third integer number:");
		z = s.nextInt();
		Maximum obj = new Maximum();
		int max = obj.largestInt(x,y,z);
	}
}
