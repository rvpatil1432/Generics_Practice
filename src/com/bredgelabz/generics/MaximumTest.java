package com.bredgelabz.generics;
import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class MaximumTest {
	private static final double DELTA = 1e-15;
	
	/*
	 * TC1 : Given Max Number at 1st Position return the Same Number
	 */
	@Test
	public void largestNumAtFirstPos(){
		Comparable result = new Maximum(40, 30, 20).Maximum();
		assertEquals(40, result);
	}
	/*
	 * TC2 : Given Max Number at 2nd Position return the Same Number
	 */
	@Test
	public void largestNumAtSecondPos(){
		Comparable result = new Maximum(30, 40, 20).Maximum();
		assertEquals(40, result);
	}
	/*
	 * TC3 : Given Max Number at 3rd Position return the Same Number
	 */
	@Test
	public void largestNumAtThirdPos(){
		Comparable result = new Maximum(40, 30, 20).Maximum();
		assertEquals(40, result);
	}
	/*
	 * TC1 : Given Max Float Number at 1st Position return the Same Number
	 */
	@Test
	public void largestFloatAtFirstPos(){
		Comparable result = new Maximum(40f, 30f, 20f).Maximum();
		assertEquals(40f, result);
	}
	/*
	 * TC2 : Given Max Float Number at 2nd Position return the Same Number
	 */
	@Test
	public void largestFloatAtSecondPos(){
		Comparable result = new Maximum(30f, 40f, 20f).Maximum();
		assertEquals(40f, result);
	}
	/*
	 * TC3 : Given Max Float Number at 3rd Position return the Same Number
	 */
	@Test
	public void largestFloatAtThirdPos(){
		Comparable result = new Maximum(20f, 30f, 40f).Maximum();
		assertEquals(40f, result);
	}
	/*
	 * TC1 : Given String at 1st Position return the Same String
	 */
	@Test
	public void largestStringAtFirstPos(){
		Comparable result = new Maximum("Banana", "Apple", "Peach").Maximum();
		assertEquals("Peach", result);
	}
	/*
	 * TC2 : Given Max String at 2nd Position return the Same String
	 */
	@Test
	public void largestStringAtSecondPos(){
		Comparable result = new Maximum("Apple", "Banana", "Peach").Maximum();
		assertEquals("Peach", result);
	}
	/*
	 * TC3 : Given Max String at 3rd Position return the Same String
	 */
	@Test
	public void largestStringAtThirdPos(){
		Comparable result = new Maximum("Apple", "Peach", "Banana").Maximum();
		assertEquals("Peach", result);
	}
}