package com.bridgelabz.generics;

class MaximumClass {
	public  <T extends Comparable<T>> T max(T a, T b, T c, T d) {
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
		T a1 = a, a2 = b, a3 = c, a4 = d;
		System.out.println("Maximum values");
		System.out.printf("For  values: %s %s %s %s", a1.toString(), a2.toString(), a3.toString(), a4.toString());
	}

}
public class ExtendMaximum {
	public static void main(String[] args) {
		MaximumClass max = new MaximumClass();
		Integer a = max.max(100, 220, 600, 950);
		System.out.println("\nThe max integer value: " + a);
		Float f = max.max(7.6f, 183.6f, 450.5f, 982.94f);
		System.out.println("\nThe max float value: " + f);
		String s = max.max("Bat", "Mat", "Cat", "Pat");
		System.out.println("\nThe max String value: " + s);

	}
}