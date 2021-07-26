package com.e.students.typeErasure;

/*A generic type in Java is compiled to a single class file. 
 * There aren’t separate versions of the generic type for each formal parameterized type.
 * For example, in the following example, 
 * Gen<Integer, String> and Gen<Float, Double> aren’t separate versions of the Gen type for each formal parameterized type */
// image we are creating two objects of below class
/**
 * Gen<Integer, String> gen1 = new Gen<Integer, String>(50,"Fifty");
 *  Gen<Float, Double> gen2 = new Gen<Float,Double>(50f,50d);
 * 
 * @author Samarth Narula
 *
 * @param <T>
 * @param <V>
 */
public class Gen<T, V> {

	private T t1;
	private V v2;

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public V getV2() {
		return v2;
	}

	public void setV2(V v2) {
		this.v2 = v2;
	}

}

// How internally java compilers it and makes it.
/**
 * The implementation of generics utilizes type erasure. In general, here is how
 * type erasure works. When your Java code is compiled, all generic type
 * information is removed (erased). This means replacing type parameters with
 * their bound type, which is Object if no explicit bound is specified, and then
 * applying the appropriate casts (as determined by the type arguments) to
 * maintain type compatibility with the types specified by the type arguments.
 * The compiler also enforces this type compatibility. This approach to generics
 * means that no type parameters exist at run time. The Gen<Integer, String> and
 * Gen<Float, Double> are same version of the Gen type for each formal
 * parameterized type.
 * Below is the example of how compiled generic class will look like
 */

class InternallyCreatedGenByJava {
	private Object t1;
	private Object v1;

	InternallyCreatedGenByJava(Object t, Object v) {
		t1 = t;
		v1 = v;
	}

	public Object getT1() {
		return t1;
	}

	public Object getV1() {
		return v1;
	}

}
