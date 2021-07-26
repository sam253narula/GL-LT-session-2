package com.f.boundedwildcard.eg1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		MyboundedWildCardWithSuper cardWithSuper = new MyboundedWildCardWithSuper();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(21);
		list1.add(90);
		cardWithSuper.print(list1);
	}
}
