package com.d.unboundedwildcard;

import java.util.List;

public class MyUnboundedWildCard {

	public void printTheList(List<?> myList) {
		for (Object object : myList) {
			System.out.println(object);
		}
	}
}
