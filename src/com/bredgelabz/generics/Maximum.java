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
	/*
	 * UC2 : Given 3 Float find the maximum
	 */
	public Float largestFloat(Float x,Float y,Float z) 
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
		Float a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first integer number:");
		x = s.nextInt();
		System.out.print("Enter the second integer number:");
		y = s.nextInt();
		System.out.print("Enter the third integer number:");
		z = s.nextInt();
		Maximum obj = new Maximum();
		int max = obj.largestInt(x,y,z);
		System.out.print("Enter the first float number:");
		a = s.nextFloat();
		System.out.print("Enter the second float number:");
		b = s.nextFloat();
		System.out.print("Enter the third float number:");
		c = s.nextFloat();
		float maxFloat = obj.largestFloat(a,b,c);
	}
}
