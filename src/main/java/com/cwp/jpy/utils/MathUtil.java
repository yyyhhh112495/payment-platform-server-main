package com.cwp.jpy.utils;

import java.math.BigDecimal;

/**
 * 数字操作工具类
 * 
 * @author lvjs
 * @history 2018年8月7日15:32:31
 */
public class MathUtil {

	/**
	 * 把数字转成BigDecimal类型
	 * 
	 * @param str
	 * @return
	 */
	public static BigDecimal getDecimal(String str) {
		if (StringUtilEx.isNullOrEmpty(str)) {
			return new BigDecimal("0");
		}
		return new BigDecimal(str);
	}
	
	/**
	 * 加法
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static String addBigDecimal(String str1, String str2) {
		return getDecimal(str1).add(getDecimal(str2)).toPlainString();
	}
	
	/**
	 * 减法
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static String subtractBigDecimal(String str1, String str2) {
		return getDecimal(str1).subtract(getDecimal(str2)).toPlainString();
	}
	
	/**
	 * 乘法,不保留小数
	 * @param str1
	 * @param str2
	 * @param num 小数位数
	 * @return
	 */
	public static String multiplyBigDecimal(String str1, String str2) {
		return getDecimal(str1).multiply(getDecimal(str2)).toPlainString();
	}
	
	/**
	 * 乘法,保留小数点
	 * @param str1
	 * @param str2
	 * @param num 小数位数
	 * @return
	 */
	public static String multiplyBigDecimal(String str1, String str2,int num) {
		return getDecimal(str1).multiply(getDecimal(str2)).setScale(num, 
				BigDecimal.ROUND_HALF_UP).toPlainString();
	}
	
	/**
	 * 比较两个数字大小
	 * @param str1
	 * @param str2
	 * @return 相等返回0，前者大于后者返回1，小于返回-1
	 */
	public static int compare(String str1, String str2) {
		return getDecimal(str1).compareTo(getDecimal(str2));
	}


	/**
	 * 比较num 是否在 minnum maxnum区间内
	 * @param num
	 * @param minnum
	 * @param maxnum
	 * @return
	 */
	public static boolean compareBetween(String num,String minnum,String maxnum){
		boolean ret = false;
		if((compare(num,minnum)>=0 ) && (compare(num,maxnum)<=0 ) ){
			ret = true;
		}else{
			ret =false;
		}
		return ret;
	}

	
	/**
	 * 整数除法,保留小数点
	 * @param str1
	 * @param str2
	 * @param num 小数位数
	 * @return 
	 */
	public static String divideBigDecimal(String str1, String str2,int num) {
		return getDecimal(str1).divide(getDecimal(str2), num,
				BigDecimal.ROUND_HALF_UP).toPlainString();
	}
	
	/**
	 * 整数除法,不保留小数,不能为无线循环小数，否则报错
	 * @param str1
	 * @param str2
	 * @param num 小数位数
	 * @return 
	 */
	public static String divideBigDecimal(String str1, String str2) {
		return getDecimal(str1).divide(getDecimal(str2)).toPlainString();
	}
	
	public static void main(String[] args) {
		String ss = divideBigDecimal("2.444", "100");
		System.out.println(ss);
	}
}
