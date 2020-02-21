package com.sajeev.test.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxStudendsToPassAfterBonus {

	public static void main(String[] args) {
		System.out.println("No of students passed after bonus: "+check(Arrays.asList(99, 50, 46, 47, 48, 49, 98)));
		System.out.println("No of students passed after bonus: "+check(Arrays.asList(0, 21, 83, 45, 64)));
	}

	private static int check(List<Integer> marks) {
		int maxMark = Collections.max(marks);
		int bonus = 100 - maxMark;
		int count =0;
		for(Integer mark : marks) {
			if(mark + bonus >= 50) {
				count ++;
			}
		}
		return count;
	}

}
