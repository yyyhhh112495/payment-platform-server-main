package com.cwp.jpy;

import com.cwp.jpy.utils.MD5Utils;
import com.cwp.jpy.utils.MathUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpyApplicationTests {

	@Test
	void contextLoads() {
	}
	private final static String salt = "Nh*72Uyhbaduio9";
	public static void main(String[] args) throws Exception {
		System.out.println(MathUtil.compareBetween("","2a","3"));
	}
}
