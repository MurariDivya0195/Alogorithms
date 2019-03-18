package com.BridgeLabs.Util;

import java.util.Arrays;
import java.util.Scanner;

public class AlogorithmsLogic {
	static Scanner  scanner = new Scanner(System.in);
	public static int getInt(){
		return scanner.nextInt();
	}
		public static Double getDouble(){
			return scanner.nextDouble();
		}	
			public static String  getString(){
				return scanner.next();
		
	}
	
	public static boolean isAnagram(char[] s1, char[] s2) {
		// TODO Auto-generated method stub
		

		int n1=s1.length;
		int n2=s2.length;
		if(n1!=n2)
		return false;
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i =0;i<n1;i++)
			if(s1[i]!=s2[i])
				return false;
		return true;
		
	}
	
// Bubble Sort
	
	public static void bubbleSort(int arr[])
	{
		int n = arr.length;
		for(int i =0;i<n-1;i++)
		{
			for(int j =i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
				   int temp = arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			}
		}
		}
		for(int i:arr)
		{
		System.out.println(i);
		}
 }
	
	
//Insertion Sort
	
	public static void insertionSort1(int[] list){
		
		int i,j, key, temp,w;
		
		{
			
			{
				for(i=0;i<list.length;i++)
				{
					for(j=0;j<=i;j++)
					{
						if(list[j]>list[i])
						{ 
						  temp=list[j];
							list[j]=list[i];
						for( w=i;w>j+1;w--)
						{
							list[w]=list[w-1];
				     		
						
						}
						list[w]=temp;
						
					}  
			     }	
			
				}
					
			}
		}
		for(int i1:list)
			{
			System.out.println(i1);
			}
		
	}
		
			
// LOGIC FOR VENDING MACHINE
			
			public static void countCurreny(int amount)
			{
				int[] notes =new int[]{1, 2, 5, 10, 50, 100, 500,1000};
				int [] noteCounter= new int[8];
				for(int i=0;i<=8;i++)
				{
					if(amount>notes[i])
					{
						noteCounter[i]=amount/notes[i];
						amount=amount-noteCounter[i]*notes[i];
					}
					
					
				}
				
				System.out.println("Currency Count ->"); 
		        for (int i1 = 0; i1 < 9; i1++) { 
		            if (noteCounter[i1] != 0) { 
		                System.out.println(notes[i1] + " : "
		                    + noteCounter[i1]); 

			
		            }       
		
				
		        }		
			}
			
	//logic to Farenhiet To celsius
			
			
			
			public static void temp_Convertion(){
			double fahrenhiet,celsius;
			int a =AlogorithmsLogic.getInt();
			switch(a){
			
			case 1:
				
				    System.out.println("enter the temperature in farenhiet");
				    fahrenhiet=AlogorithmsLogic.getDouble();
				    fahrenhiet= (fahrenhiet *9/5) + 32;
				   System.out.println("tempertaure in celcius"+fahrenhiet);
				   break;
				   
			case 2:
				System.out.println("enter the temperature in celcius");
				celsius=AlogorithmsLogic.getDouble();
				celsius=((celsius-32) * 5/9);
				System.out.println("temperature in fahrenhiet is"+celsius);
				break;

			}
			}

			
	// LOGIC TO MERGE SORT
			
			
			static void mergeSort(int[] arr1, int low, int high)
			{
				if(low==high)
					return;
				
				else
				{
				   	 int mid = (low+high)/2;
					 mergeSort(arr1,low,high);
					 mergeSort(arr1,mid+1,high);
					 mergeSort(arr1,low,mid+1);
					 
				}
				
			}
	// Binary Search
			
			public static int binarySearch(String[]s, String word){
				
				int l=s.length-1;
				int nl=0;
				while(nl<=l)
				{
					int m=(nl+l)/2;
					int mid=word.compareTo(s[m]);
					if(mid==0)
						return m;
					if(mid>0)
						nl=m+1;
					else
						l=m-1;
					
				}
				
			
			return -1;
}
			
			
//LOGIC FOR MONTLY PAYMENT
			
			
			public static double montlyPayment(double p, double t, double r)
			{
					double n= 12*t;
					double r0=r/(12*100);
					double payment=p*r0/1-Math.pow(1+r0,-n);
					return payment;
					
				
			}
		
	//MERGE SORT
   //split the given array			
	public static void merge(String[] names)
	{
		if(names.length>=2)
		{
			String[] left= new String[names.length/2];
			String[] right= new String[names.length-names.length/2];
			for(int i=0;i<left.length;i++){
				left[i]=names[i];
			}
			
			for(int i=0;i<right.length;i++){
				right[i]=names[i + names.length/2];
			}
			merge(left);
			merge(right);
			mergeSort(names,left,right);
		}
	}
	//sort and merge
	public static void mergeSort(String[] names, String[] left, String[] right)
       {
		
		int a=0;
		int b=0;
		for(int i=0;i<names.length;i++)
		{
			if(b>=right.length || (a<left.length && left[a].compareToIgnoreCase(right[b]) <0)){
				names[i]=left[a];
				a++;
			}
			else{
				names[i]=right[b];
				b++;
			}
		}
		}
}
