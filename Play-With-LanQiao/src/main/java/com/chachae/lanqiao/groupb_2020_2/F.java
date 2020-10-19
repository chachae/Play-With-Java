package com.chachae.lanqiao.groupb_2020_2;

import java.util.Arrays;
import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		double sum = 0;
		int[] scores = new int[count];
		for (int i = 0; i < count; i++) {
			scores[i] = in.nextInt();
			sum += scores[i];
		}
		in.close();
		Arrays.sort(scores);
		System.out.println(scores[count - 1]);
		System.out.println(scores[0]);
		System.out.printf("%.2f", sum / count);
	}
}
