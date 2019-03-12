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
	

}
