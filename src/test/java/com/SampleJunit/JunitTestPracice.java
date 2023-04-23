package com.SampleJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class JunitTestPracice {

JunitPractice j1=new JunitPractice();


@Test
@DisplayName("Poonam testing")
public void testbiggest() {
		
		int exp=6;
		int res=j1.biggest(5, 6);
		assertEquals(exp, res);
	}

	@Test
	public void testbiggest2() {
		
		assertNotEquals(3, 4);
	}
	@Test
	public void checkname() {
		
		assertSame("Poonam",j1.whatisyourname());
	}
	
	@Test
	public void checkname2() {
		assertNotSame("Java",j1.whatisyourname());
	}
	
	@Test
	public void eventest() {
		boolean res=j1.even(6);
		assertTrue(res);
	}
	
	@Test
	public void testodd() {
		boolean res=j1.even(7);
		assertFalse(res);
	}

}

