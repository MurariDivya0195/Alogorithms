package com.BridgeLabs.algorithms;

import java.util.ArrayList;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class AnagramAndPalindrome {

	public static void main(String[] args){
		int n=AlogorithmsLogic.getInt();
 ArrayList<Integer> primeNumbers=AlogorithmsLogic.primeNumber(n);
 
      for(int i:primeNumbers)
      {
    	  System.out.println(i);
      }
		
 		System.out.println("numbers which are anagrams");
      
 		AlogorithmsLogic.primeAnagram(primeNumbers);
 
	}

}
