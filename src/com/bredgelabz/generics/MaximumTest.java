package com.bredgelabz.generics;
import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class MaximumTest {
	private static final double DELTA = 1e-15;
	Maximum obj = new Maximum();
	/*
	 * TC1 : Given Max Number at 1st Position return the Same Number
	 */
	@Test
	public void largestNumAtFirstPos(){
		
		int result = obj.largestInt(40, 30, 20);
		assertEquals(40, result,DELTA);
	}
	/*
	 * TC2 : Given Max Number at 2nd Position return the Same Number
	 */
	@Test
	public void largestNumAtSecondPos(){
		int result = obj.largestInt(30, 40, 20);
		assertEquals(40, result,DELTA);
	}
	/*
	 * TC3 : Given Max Number at 3rd Position return the Same Number
	 */
	@Test
	public void largestNumAtThirdPos(){
		int result = obj.largestInt(20, 30, 40);
		assertEquals(40, result,DELTA);
	}
	/*
	 * TC1 : Given Max Float Number at 1st Position return the Same Number
	 */
	@Test
	public void largestFloatAtFirstPos(){
		float result = obj.largestFloat(40f, 30f, 20f);
		assertEquals(40f, result,DELTA);
	}
	/*
	 * TC2 : Given Max Float Number at 2nd Position return the Same Number
	 */
	@Test
	public void largestFloatAtSecondPos(){
		float result = obj.largestFloat(30f, 40f, 20f);
		assertEquals(40f, result,DELTA);
	}
	/*
	 * TC3 : Given Max Float Number at 3rd Position return the Same Number
	 */
	@Test
	public void largestFloatAtThirdPos(){
		float result = obj.largestFloat(20f, 30f, 40f);
		assertEquals(40f, result,DELTA);
	}
}
