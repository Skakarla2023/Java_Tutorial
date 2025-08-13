package com.skakarla.java_Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 2; i < n; i++) {
			list.add(i);
		}

		for (int i = 2; i < n; i++) {
			Iterator<Integer> iterator = list.iterator();
			while (iterator.hasNext()) {
				int j = iterator.next();
				if (j != i && j % i == 0) {
					iterator.remove();
				}
			}
		}
		System.out.println("Primes:"+list);
		System.out.println(list.size());
	}

}
