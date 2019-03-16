package com.BridgeLabs.algorithms;

public class PrimeNumbers {
	
	     public static void main(String[] args) {
			
	   int i ,j, k;
	   for(i=0;i<=1000;i++)
	   {
		   k=0;
		   for(j=2;j<i;j++)
		   {
			   if(i%j==0)
			   {
				   k=1;
				   break;
			   }
		   }
		   
		   if(k==0)
		   {
			   System.out.println(i);
		   }
	   }
	    	 
		}
	

}
