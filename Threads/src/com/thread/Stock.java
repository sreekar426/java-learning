package com.thread;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stock {
	public static void main(String[] args) {
		int n = 20;
		int[] ar = {4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5};
		System.out.println(sockMerchant(n, ar));
	}

	static int sockMerchant(int n, int[] ar) {
		int count = 0;
		Map<Integer, Integer> myMap = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {

			if (myMap.containsKey(ar[i])) {
				myMap.put(ar[i], myMap.get(ar[i]) + 1);

			} else {
				myMap.put(ar[i], 1);
			}

		}

		Set<Entry<Integer, Integer>> mySet = myMap.entrySet();

		for (Entry<Integer, Integer> entry : mySet) {
			System.out.println(entry.getKey()+"======>"+entry.getValue());
			if (entry.getKey() == 1) {
				if (entry.getValue() > 1) {
					count += entry.getValue() / 2;
				}

			}

			else if (entry.getValue() % 2 == 0) {
				count += entry.getValue() / 2;
			} else {
				if (entry.getValue() > 1) {
					count += entry.getValue() / 2;
				}
			}
		}

		return count;
	}

}
