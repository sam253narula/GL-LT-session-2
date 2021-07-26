package com.c.students.WildcardCapture;
//Qin Understanding Wildcard capture
/* Answer 1: The term wildcard capture refers to the fact that generic methods can work with arguments
whose type is a wildcard type.*/

/*Answer 2:  In some cases, the compiler infers the type of a wildcard.
For example, a list may be defined as List<?> but, 
when evaluating an expression, the compiler infers a particular type from the code.
This scenario is known as wildcard capture.*/
// For deep dive about Wildcard capture and Helper method concepts refer https://docs.oracle.com/javase/tutorial/java/generics/capture.html
public class WildcardCaptureDemo {

	public static void main(String[] args) {
		GenOne<String> g1 = new GenOne<>();
		g1.setV1("sam");
		g1.setV2("Vikram");
		GenTwo<String> genTwo = copyGenOneToGenTwo(g1);
		System.out.println(genTwo);
	}

	static <V> GenTwo<V> copyGenOneToGenTwo(GenOne<V> g1) {
		GenTwo<V> g2 = new GenTwo<V>();
		g2.setV1(g1.getV1());
		g2.setV2(g1.getV2());
		return g2;
	}
}
