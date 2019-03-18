package com.BridgeLabs.algorithms;

import java.util.Arrays;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class BinarySearch {

	
	public static void main(String[] args) {
		System.out.println("enter no of elements:");
		int n=AlogorithmsLogic.getInt();
		
		String[] s= new String[n];
		System.out.println("enter elements in the list :");
		for(int i=0;i<n;i++){
			s[i]=AlogorithmsLogic.getString();
		}
			System.out.println("word to search:");
			String search =AlogorithmsLogic.getString();
			Arrays.sort(s);
			for(String e :s)
			{
				System.out.println(e);
			}
			
			int x= AlogorithmsLogic.binarySearch(s,search);
			
			if(x==-1){
				System.out.println("not found");
				
			}
			else
				System.out.println("found"+ search + "in" + x);
	}

	
	}

