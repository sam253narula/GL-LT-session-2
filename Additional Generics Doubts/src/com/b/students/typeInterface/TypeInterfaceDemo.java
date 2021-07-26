package com.b.students.typeInterface;

// Qin Understanding of Type interface
/* Answer: An interface is a type in Java. In simple words, for below example we can say,
we can use reference of Interface1 and interface 2 if we want to, practically this is the meaning of Type Interface*/
public class TypeInterfaceDemo {

	public static void main(String[] args) {
		ImplementingClass implementingClass = new ImplementingClass();
		System.out.println(implementingClass instanceof ImplementingClass);
		System.out.println(implementingClass instanceof Interface1);
		System.out.println(implementingClass instanceof Interface2);
		
	}

}
