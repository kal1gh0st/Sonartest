package com.example.Sonartest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestClass {

	Calculation obj = new Calculation();
	
	@Test
	public void twoPlusTwoEqualsFour() {
		assertEquals(4, obj.adder(2, 2));
	}
}
