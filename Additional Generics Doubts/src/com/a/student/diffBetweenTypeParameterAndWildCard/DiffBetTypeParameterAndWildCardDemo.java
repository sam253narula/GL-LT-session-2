package com.a.student.diffBetweenTypeParameterAndWildCard;

import java.util.ArrayList;
import java.util.List;

public class DiffBetTypeParameterAndWildCardDemo {
	public static void main(String[] args) {
		DiffBetTypeParameterAndWildCard temp = new DiffBetTypeParameterAndWildCard();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(4);
//		List<Long> list2 = new ArrayList<Long>();
//		list2.add(3L);
//		list2.add(4L);
		List<?> result  = temp.combineTwoSameKindOfList(list1, list2);
		for (Object object : result) {
			System.out.println(object);
		}
		
	}
}
