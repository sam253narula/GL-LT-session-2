package com.f.boundedwildcard.eg1;

import java.util.List;
 
//Lower Bound Wildcard example
public class MyboundedWildCardWithSuper {

	public void print(List<? super Integer> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
