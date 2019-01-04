package com.test02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * java.util.regex
 * 1. Pattern	:regular expression 컴파일
 * 2. Matter	:Pattern이 입력한 문자열과 맞는지 유므를 확인
 * 3. PatternSyntaxException	:패턴 문접이 맞지 않을 경우 발생하는 이벤트
 * https://regexr.com/
 */

public class MTest04 {
	public static void Prn() {
		Pattern p = Pattern.compile("abcd \\d");
		String candidate = "abcd 4";
		Matcher m = p.matcher(candidate);
		if (m != null)
			System.out.println(m.find());
	}

	public static void Prn02() {
		String regex = "\\w+\\s";
		Pattern pattern = Pattern.compile(regex);

		String candidate = "playdata.io abcd";

		Matcher matcher = pattern.matcher(candidate);

		if (matcher.find()) {
			System.out.println("GROUP 0 : " + matcher.group(0));
		}
	}

	public static void Prn03() {
		String regex = "(\\d{3})(\\d{3})(\\d{4})";

		Pattern p = Pattern.compile(regex);
		String source = "1234567890, 12345, and 9876543210";

		Matcher m = p.matcher(source);
		System.out.println("m : " + m);

		while (m.find()) {
			System.out.println("Phone : " + m.group(0) + " ,   (" + m.group(1) + ")" + m.group(2) + "-" + m.group(3));
		}
	}

	public static void main(String[] args) {
		Prn();
		Prn02();
		Prn03();
	}
}
