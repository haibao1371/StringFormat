package com.hiabao.demo;

/**
 * @author ����
 * @date:20180206
 * @comment:ѧϰselenium�Զ�����Ƶ��ʱ����pageObject��ʱ�򣬻�ȡ��̬xpathʱ���õ���String.format�÷�����������ѧϰ��
 */
public class Demo {
	/**
	 * 1.ռλ���� 1.1����ռλ��
	 */
	public static void main(String[] args) {
		String s = String.format("%s", "haibao");
		System.out.println(s);
		/** 1.2���ռλ�� -��˳��*/
		String s1 = String.format("%s,%s,%s", "wang", "hai", "bao");
		System.out.println(s1);
		/** 1.3��������ʽ��-������ */
		String s2 = String.format("%2$s%3$s", "wang","hai","bao");
		System.out.println(s2);
	}
}
