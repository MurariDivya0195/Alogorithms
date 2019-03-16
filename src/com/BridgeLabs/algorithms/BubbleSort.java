package com.BridgeLabs.algorithms;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		System.out.println("enter the values :");
		int n = AlogorithmsLogic.getInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
		
		 a[i] = AlogorithmsLogic.getInt();
		}
		AlogorithmsLogic.bubbleSort(a);
		
		
		
	}

}
