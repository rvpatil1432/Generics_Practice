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
	/*
	 * UC3 : Given 3 String find the maximum
	 */
	public String largestString(String x,String y,String z) 
	{
		Integer s1 = x.length(); 
		Integer s2 = y.length(); 
		Integer s3 = z.length(); 
		if(s1.compareTo(s2) > 0 && s1.compareTo(s3) > 0)
		{
			return x;
		}
		else if(s2.compareTo(s3) > 0)
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
		String str1,str2,str3;
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
		System.out.print("Enter the string one:");
		str1 = s.next();
		System.out.print("Enter the string two:");
		str2 = s.next();
		System.out.print("Enter the string three:");
		str3 = s.next();
		String maxStr = obj.largestString(str1,str2,str3);
	}
}
