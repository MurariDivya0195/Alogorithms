package com.BridgeLabs.algorithms;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class BinaryFunction {
	
	public static void main(String[] args) {
		int x=100;
		System.out.println("enter the number :");
		int num = AlogorithmsLogic.getInt();
		AlogorithmsLogic.binToDec(num);
		
		System.out.println(swapNibbles(x));
		System.out.print(powerOfTwo(x));
	}
	
	
	//  Logic To Swap Nibbles
	
	public static  int swapNibbles(int x){
		
	return((x & 0x0F)<< 4 | (x & 0xF0)>>4);
		
	}
	
    // FInding the Power Of 2 
	
	public static boolean powerOfTwo(int num)
       {
    	  
   	       while(num>=0)
   	       {
   	    	   if(num%2==0)
   	    	   {
   	    		num=num/2;
   	    		   return true;
   	    		
   	    		  
   	    	   }
   	    	   else
   	    		   return false;
   	    	
   	    	 
   	       }
		return false;
   	    
    	   
    	 }
}
