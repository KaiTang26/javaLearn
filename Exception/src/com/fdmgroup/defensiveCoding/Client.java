package com.fdmgroup.defensiveCoding;

public class Client {
	
	public static void main(String[] args){
		
//		issueWithCasting();
		
		issueWithNullPointer();
		
//		issueWithArithmetic();
	}

	private static void issueWithArithmetic() {
		// TODO Auto-generated method stub
		NODefensiveCodin.arithmeticCheck(4, 2);
		
		NODefensiveCodin.arithmeticCheck(4, 0);
		
		Defensive.arithmeticCheck(4, 0);
		
		
	}

	private static void issueWithNullPointer() {
		// TODO Auto-generated method stub
		NODefensiveCodin.nullPointerCheck("Any Object");
		NODefensiveCodin.nullPointerCheck(null);
		Defensive.nullPointerCheck(null);
		
	}

	private static void issueWithCasting() {
		// TODO Auto-generated method stub
		System.out.println(NODefensiveCodin.toStringConvert("Hello!"));
		
//		not valid b/c not string	
		System.out.println(NODefensiveCodin.toStringConvert(new Object()));
			
		System.out.println(Defensive.toStringConvert(new Object()));
			
	}

}
