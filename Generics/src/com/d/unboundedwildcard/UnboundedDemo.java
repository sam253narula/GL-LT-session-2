package com.d.unboundedwildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedDemo {

	public static void main(String[] args) {
		MyUnboundedWildCard unboundedWildCard = new MyUnboundedWildCard();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		unboundedWildCard.printTheList(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Samarth");
		list2.add("Abhishek");
		list2.add("Shiva");
		unboundedWildCard.printTheList(list2);
	}
}
