package com.test02;

import java.util.StringTokenizer;

public class MTest02 {
	public static void main(String[] args) {
		String str = "public \t static \\t void '\t' main(String[] args)";
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken() + "\t: " + st.countTokens());
		}

	}
}
