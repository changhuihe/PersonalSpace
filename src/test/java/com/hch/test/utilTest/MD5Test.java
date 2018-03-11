package com.hch.test.utilTest;

import org.junit.Test;

import com.hch.util.MD5Util;

public class MD5Test {

	@Test
	public void StringToMD5() {
		String s = new String("123");
		System.out.println(s);
		s = MD5Util.string2MD5(s);
		System.out.println(s);
	}
}
