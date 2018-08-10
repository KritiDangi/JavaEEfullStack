package com.visa.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testGetSum() {
		int[] data= {2,4,5,1};
		int expected=12;
		assertEquals(expected,ArrayUtil.getSum(data));
		
		int[] values= {2,1,-3};
		expected=0;
		assertEquals(expected,ArrayUtil.getSum(values));
	}

	@Test
	public void testGetOccurenceCount() {
		int[] data= {2,5,5,1};
		int expected=2;
		assertEquals(expected,ArrayUtil.getOccurenceCount(data, 5));
	}

	@Test
	public void testSort() {
		int[] data= {2,4,5,1};
		int[] expected= {1,2,4,5};
		ArrayUtil.sort(data);
		assertArrayEquals(expected,data);
	}

}
