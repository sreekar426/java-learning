package com.thread;

import java.util.ArrayList;
import java.util.List;

public class LeaderBoard {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		int[] players = { 100, 90, 90, 80, 75, 60 };
		int[] alise = { 50, 65, 77, 90, 102 };

		for (int i = 0; i < players.length; i++) {

			for (int j = 0; j < alise.length; j++) {
if(players[i]>=alise[j]) {
	
}else {
	li.add(players[i]);
}
			}
		}
		for (int i : alise) {
			System.out.println(i);
		}
	}

}
