package com.BridgeLabs.algorithms;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class InsertionSort {

	public static void main(String[] args) {
		
		
		System.out.println("enter the size");
		int n1 =AlogorithmsLogic.getInt();
		System.out.println("enter the number");
		int list[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			
		
		 list[i] = AlogorithmsLogic.getInt();
		}
		
		
		
		AlogorithmsLogic.insertionSort1(list);
		
	
	}
	
}
