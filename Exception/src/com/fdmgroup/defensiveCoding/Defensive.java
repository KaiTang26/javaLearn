package com.fdmgroup.defensiveCoding;

public class Defensive {
	
	public static String toStringConvert(Object object){
		
		String str = null;
		
		if(object instanceof String){
			
			str = (String) object;
			
		}
		 
		
		return str;
		
	}
	
	public static void nullPointerCheck(Object object){
		
		if(object !=null){
			System.out.println(object.toString());
			
		}else{
			System.out.println("object is null");
		}
		
		
	}
	
	public static void arithmeticCheck(int op1, int op2){
		
		if(op2 != 0){
			
			System.out.println(op1/op2);
			
		}else{
			System.out.println("op2 is zero");
		}
		
	}

}
