package com.fdmgroup.defensiveCoding;

public class NODefensiveCodin {
	
	public static String toStringConvert(Object object){
		String str = (String) object;
		
		return str;
		
	}
	
	public static void nullPointerCheck(Object object){
		
		System.out.println(object.toString());
		
	}
	
	public static void arithmeticCheck(int op1, int op2){
		System.out.println(op1/op2);
	}

}
