package com.bridgelabz.generics;

public class MaximumOfIntegers {
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
		Integer a = 300, b = 800, c = 900;
		System.out.println("For Integer Values");
		max(a, b, c);
	}
}