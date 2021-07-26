package com.a.student.diffBetweenTypeParameterAndWildCard;

import java.util.ArrayList;
import java.util.List;

//When to use types? & When to use wildcard? Advantage & Disadvantage
public class WhereAndWhyTypeParameterShouldBeUsed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> list1 = new ArrayList<String>();
			list1.add("Samarth");
			list1.add("Vikram");
			System.out.println(getSecondItem(list1));
	}

	// Type Parameter will be helpful here, lets say we want to fetch and return
	// some specific element or do some business logic on it.
	public static <T> T getSecondItem(List<T> list) {
		T item = list.get(1);
		return item;
	}

	// For these simple printing logic, we can use wildcard or Type Parameter
	public static /* <T> */void printList(List<?> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

}
