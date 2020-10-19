package com.chachae.lanqiao.groupb_2020_2;

import java.util.HashSet;
import java.util.Set;

public class D {
	private static Set<String> records;

	public static void main(String[] args) {
		String str = "abcdefg";
		int end = str.length();
		records = new HashSet<>();
		dfs(0, end, str, new StringBuilder());
		for (String e : records) {
			System.out.println(e);
		}
		System.out.println((records.size() - 23 - 1) / 2 + 1);
		System.out.println(records.size());
	}

	private static void dfs(int start, int end, String str, StringBuilder sb) {
		if (sb.length() > 0 && sb.length() <= end) {
			records.add(sb.toString());
		}

		if (sb.length() > end) {
			return;
		}

		for (int i = start; i < end; i++) {
			sb.append(str.charAt(i));
			dfs(i + 1, end, str, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}

}
