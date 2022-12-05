package com.bridgelabz.generics;

public class MaxToStdUsingGenerics {
	public static <T extends Comparable<T>> T max(T a, T b, T c, T d) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		if (d.compareTo(max) > 0) {
			max = d;
		}
		printMax(a, b, c, d, max);
		return max;
	}

	public static <T> void printMax(T a, T b, T c, T d, T max) {
		System.out.printf("Max of %s %s %s and %s is %s\n", a, b, c, d, max);
	}

	public static void main(String[] args) {
		Integer a1 = 200, a2 = 310, a3 = 450, a4 = 985;
		Float b1 = 8.57f, b2 = 11.70f, b3 = 87.96f, b4 = 347.98f;
		String c1 = "Cat", c2 = "Rat", c3 = "Bat", c4 = "Mat";

		max(a1, a2, a3, a4);
		max(b1, b2, b3, b4);
		max(c1, c2, c3, c4);
	}

}
