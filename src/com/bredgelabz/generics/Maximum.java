package com.bredgelabz.generics;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;



public class Maximum<T extends Comparable<T>> {
	T x,y,z;

	public Maximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public T Maximum() {
		return Maximum.maximum(x, y, z);
	}
	public static <T extends Comparable<T>> T maximum(T x, T y, T z){
		T max = x;
		if(y.compareTo(max) > 0 ) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	public static <T> void printMax(T x,T y,T z,T max){
		System.out.println("Max is "+max);
	}
	public static void main(String[] args) {
		Integer xInt = 3, yInt = 4, zInt = 5;
		Float xF1 = 6.6f, yF1 = 8.8f, zF1 = 7.7f;
		String xStr = "Pear", yStr = "Apple", zStr = "Orange"; 
		new Maximum(xInt, yInt, zInt).Maximum();
		new Maximum(xF1, yF1, zF1).Maximum();
		new Maximum(xStr, yStr, zStr).Maximum();
	}
}
