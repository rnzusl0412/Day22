package com.test02;

//���ڿ� ���� ����

public class MTest01 {
	public static void main(String[] args) {
		String str = "boo:and:foo";
		System.out.println(str.length());
		String [] res = str.split("o");
		
		System.out.println(res.length);
		for(String result : res) {
			System.out.println(result);
		}
	}
}
