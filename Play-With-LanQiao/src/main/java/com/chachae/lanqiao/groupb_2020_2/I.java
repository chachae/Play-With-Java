package com.chachae.lanqiao.groupb_2020_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class I {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int len = str.length();
		int ans = 0;
		for (int left = 0; left < len; left++) {
			for (int end = len; end > left; end--) {
				ans += calNum(str.substring(left, end));
			}
		}
		System.out.println(ans);
	}

	private static int calNum(String str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		return set.size();
	}
}
