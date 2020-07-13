package com.thread;

public class Garden {

	public static void main(String[] args) {

		int s = 7;
		int t = 11;
		int a = 5;
		int b = 15;

		int[] apples = { -2, 2, 1 };
		int[] oranges = { 5, -6 };

		countApplesAndOranges(s, t, a, b, apples, oranges);
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int appleCount = 0;
		int orangeCount = 0;

		for (int i = 0; i < apples.length; i++) {

			if (apples[i] + a >= s && apples[i] + a <= t) {
				appleCount++;

			}

		}

		for (int i = 0; i < oranges.length; i++) {

			if (oranges[i] + b >= s && oranges[i] + b <= t) {
				orangeCount++;

			}

		}

		System.out.println(appleCount);
		System.out.println(appleCount);
	}

}
