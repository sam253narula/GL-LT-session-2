package com.d.students.wildcardHelperMethod;

import com.c.students.WildcardCapture.GenOne;

// Example of generic helper method swap
public class JavaApp {

	// non-generic method cannot work for this swapping use-case
//	static void swapWithGeneric(GenOne<?> g1) {
//		Object getV1 = g1.getV1();
//		g1.setV1(g1.getV2());
//		g1.setV2(getV1);
//	}

	// Generic method like below is only called helper method, this will work here
	static <V> void swap(GenOne<V> g1) {
		V getV1 = g1.getV1();
		g1.setV1(g1.getV2());
		g1.setV2(getV1);
	}

	public static void main(String[] args) {
		GenOne<Integer> g1 = new GenOne<Integer>();
		g1.setV1(10);
		g1.setV2(20);
		System.out.println("Before Swapping: " + g1.getV1() + " " + g1.getV2());

		GenOne<?> anyg1 = g1;
		swap(anyg1);
		System.out.println("After Swapping: " + g1.getV1() + " " + g1.getV2());
	}
}
