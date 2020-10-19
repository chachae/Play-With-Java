package com.chachae.lanqiao.groupb_2020_2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class G {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		char[] chs = str.toCharArray();
		Map<Character, Integer> records = new HashMap<>();
		for (char ch : chs) {
			records.put(ch, records.get(ch) != null ? records.get(ch) + 1 : 1);
		}
		int max = Collections.max(records.values());
		char n = '0';
		Set<Map.Entry<Character, Integer>> entrySet = records.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == max) {
				n = entry.getKey();
				break;
			}
		}
		System.out.printf("%s%n%s", n, max);
	}
}
