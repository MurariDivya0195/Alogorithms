package com.BridgeLabs.algorithms;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class VendingMachine {
	
	public static void main(String[] args) {
		
		int [] arr ={1,2,5,10,50,100,500,1000};
		System.out.println("enter money :");
		int money=AlogorithmsLogic.getInt();
		int count;
		for(int i=arr.length-1;i>=0;i--)
		{
			count=0;
			if(money==0)
			return;
			else
			{
				if(money>=arr[i])
				{
					count=money/arr[i];
					
					System.out.println(arr[i]+":"+count);
					money=money%arr[i];
				}
			}
		}
	}
}
	
	