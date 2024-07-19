package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculatortest {

	Calculator cal;
	Calculator cal1;
	Calculator cal2;
	@Before
	public void setUp() throws Exception 
	{
		//cal  = new Calculator();
		//cal1 = new Calculator();
		cal2 = new Calculator();
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	@Test
	public void test() 
	{
		//assertEquals(7,cal.add(7, 3) );
		//assertEquals(4,cal.add(4, 0) );
		//assertEquals(3,cal.add(0, 3) );
		//assertEquals(7,cal.add(5, 3) );
		
		//assertEquals(7,cal1.add(7, 3) );
		//assertEquals(4,cal1.add(4, 0) );
		int[] arr = {4, 7, 2, 9, 5};
		
		assertEquals(9,cal2.findMax(arr) );
		
	}
	
	@Test
	public void test1() 
	{
		//assertEquals(7,cal.add(5, 3) );
		
		
	}

}
