package com.chachae.lanqiao.groupb_2020_2;

public class A {

	public static void main(String[] args) {
		int ans = 0;
		for (int i = 1; i <= 2020; i++) {
			char[] chs = String.valueOf(i).toCharArray();
			for (char ch : chs) {
				if (ch == '2') {
					++ans;
				}
			}
		}
		System.out.println(ans);
	}
}
