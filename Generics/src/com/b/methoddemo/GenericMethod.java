package com.b.methoddemo;

public class GenericMethod {

	public <E> void printElement(E[] elements) {
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}

}
