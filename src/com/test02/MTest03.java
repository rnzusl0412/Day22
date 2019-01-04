package com.test02;

import java.util.*;

public class MTest03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str = "public 3static 3void 3main(String[] args";
		Scanner sc = new Scanner(str).useDelimiter("\\s");
		System.out.println(sc.delimiter()); // \p{javaWhitespace}+
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
	}
}
