package com.bridgelabz.generics;

public class MaximumOfFloat {
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMax(a, b, c, max);
		return max;
	}

	public static <T> void printMax(T a, T b, T c, T max) {
		System.out.printf("Max of %s %s and %s is %s\n", a, b, c, max);
	}

	public static void main(String[] args) {
		Float a = 7.3f, b = 174.22f, c = 982.45f;
		System.out.println("For Float values");
		max(a, b, c);
	}

}
