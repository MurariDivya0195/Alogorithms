package com.BridgeLabs.algorithms;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class Anagram {
	
	public static void main(String[] args) {
		System.out.println("enter 1st String :");
		String str1=AlogorithmsLogic.getString();
		System.out.println("enter 2nd String :");
		String str2=AlogorithmsLogic.getString();
		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		
				
		System.out.println(AlogorithmsLogic.isAnagram(s1,s2));
		
	}

}
