package com.BridgeLabs.algorithms;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class MergeSort {
	public static void main(String[] args) {
		
		int n =AlogorithmsLogic.getInt();
		String [] array=new String[n];
		for(int i=0;i<n;i++)
		{
			array[i]=AlogorithmsLogic.getString();
		}
		AlogorithmsLogic.merge(array);
		for(String s:array)
		{
		System.out.println(s);
		}
	}

}
