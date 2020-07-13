package com.thread;

public class Score {

	public static void main(String[] args) {
		int[] score = {503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503};
		breakingRecords(score);
	}

	static int[] breakingRecords(int[] scores) {
		int maxCount = 0;
		int minCount = 0;
		int score = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < scores.length; i++) {
			if (score == 0) {
				score = scores[i];
				max = scores[i];
				min = scores[i];
			} else {
				if (scores[i] == min && scores[i] == max) {
					maxCount=0;
					minCount=0;
				} else if (scores[i] <= min) {
					min = scores[i];
					minCount++;
				} else if (scores[i] > max) {
					max = scores[i];
					maxCount++;
				}
			}

		}

		int[] temp = { maxCount, minCount };
		System.out.println(maxCount);
		System.out.println(minCount);
		return temp;

	}
}
