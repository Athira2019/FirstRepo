package com.cerner.sort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Iterator;

class Solution {
	public int solution(int N) {
		// write your code in Java SE 8
		int val;
		val = 0;

		String[] combos = new String[100];

		String x;
		String sent;

		sent = Integer.toString(N);

		/*
		 * Scanner sc = new Scanner(System.in); N = sc.nextInt(); M = sc.nextInt();
		 */

		List<String> combocenter = new ArrayList<>();
		combocenter.add(String.valueOf(sent.charAt(0)));
		for (int i = 1; i < sent.length(); i++) {
			for (int j = combocenter.size() - 1; j >= 0; j--) {
				String word = combocenter.remove(j);
				for (int k = 0; k <= word.length(); k++) {
					combocenter.add(word.substring(0, k) + sent.charAt(i) + word.substring(k));
				}
			}
		}
		List<String> bl = combocenter.stream().distinct().collect(Collectors.toList());
		for (int i = 0; i < bl.size(); i++) {
			x = bl.get(i);
			if (!x.startsWith("0")) {
				val++;
			}
		}
		if (val == 0)
			return 1;
		else
			return val;
	}
}
