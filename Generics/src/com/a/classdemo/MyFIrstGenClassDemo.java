package com.a.classdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Samarth Narula
 * 
 * Type Parameter :
 * 1. T -> Type
 * 2. E -> Element
 * 3. K -> Key
 * 4. N -> Number
 * 5. V -> Value
 *
 */
public class MyFIrstGenClassDemo {
	
	public static void main(String[] args) {
		MyFirstGenClass<String> strObj = new MyFirstGenClass<String>();
		strObj.setMyObject("Samarth Narula");
		System.out.println(strObj.getMyObject());
		
		MyFirstGenClass<Integer> intObj = new MyFirstGenClass<Integer>();
		intObj.setMyObject(2021);
		System.out.println(intObj.getMyObject());
		
	}
}
