package com.hiabao.demo;

/**
 * @author 海宝
 * @date:20180206
 * @comment:学习selenium自动化视频的时候，做pageObject的时候，获取动态xpath时，用到了String.format用法，今天予以学习；
 */
public class Demo {
	/**
	 * 1.占位符： 1.1单个占位符
	 */
	public static void main(String[] args) {
		String s = String.format("%s", "haibao");
		System.out.println(s);
		/** 1.2多个占位符 -按顺序*/
		String s1 = String.format("%s,%s,%s", "wang", "hai", "bao");
		System.out.println(s1);
		/** 1.3对整数格式化-按索引 */
		String s2 = String.format("%2$s%3$s", "wang","hai","bao");
		System.out.println(s2);
	}
}
