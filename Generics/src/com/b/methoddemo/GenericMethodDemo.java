package com.b.methoddemo;

import java.util.Map;

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
	//	int[] arr  = {1,2,3,3,4};
		//We cannot use primitive data type, hence we have used its wrapper class
		Integer[] arrI = {1,2,3,4,5};
		gm.printElement(arrI);
		String[] arrS = {"Samarth", "Abhishek"};
		gm.printElement(arrS);
		
	}
}
