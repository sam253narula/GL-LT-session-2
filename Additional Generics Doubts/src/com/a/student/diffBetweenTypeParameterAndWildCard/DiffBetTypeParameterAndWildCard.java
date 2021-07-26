package com.a.student.diffBetweenTypeParameterAndWildCard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*Qin Difference between generics Type & wildcard 
Answer: If you want to enforce some relationship on the different types of method arguments, 
you can't do that with wildcards, you have to use type parameters.
practical example in this class*/

public class DiffBetTypeParameterAndWildCard {

	/*
	 * When you ensure that the list1 and list2 list passed to combine() method
	 * should be of same parameterized type, you can do it with type parameters or
	 * we can say with generics type. As done in below method
	 */
	public <T extends Number> List<T> combineTwoSameKindOfList(List<T> list1, List<T> list2) {
		List<T> combinedList = new ArrayList<T>();
		combinedList.addAll(list1);
		combinedList.addAll(list2);
		return combinedList;
	}

	/*
	 * public <T extends Number> List<?> combineTwoSameKindOfList(List<?> list1,
	 * List<?> list2) { List combinedList = new ArrayList();
	 * combinedList.addAll(list1); combinedList.addAll(list2); return combinedList;
	 * }
	 */

	// We cannot ensure Type safety if we use ? here right, refer below method, the
	// method arg list can be float list or integer list
	public void combineListOfDifferentTypesNotPossibleInJava(List<? extends Number> list1,
			List<? extends Number> list2) {
		List<? extends Number> combinedList = new ArrayList<>();

		/*
		 * Below method will not work, becz java is statically types language, it needs
		 * to ensure the new list it is adding with addAll is of same type, now when you
		 * write <? extends Number>, this means that the method argument list can be
		 * list of Integer or list of float, in java output list cannot contain elements
		 * of type different data types
		 */
		// combinedList.addAll(list1);
	}

}
