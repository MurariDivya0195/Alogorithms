package com.BridgeLabs.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlogorithmsLogic {
	static Scanner scanner = new Scanner(System.in);

	public static int getInt() {
		return scanner.nextInt();
	}

	public static Double getDouble() {
		return scanner.nextDouble();
	}

	public static String getString() {
		return scanner.next();

	}

	public static boolean isAnagram(char[] s1, char[] s2) {
		// TODO Auto-generated method stub

		int n1 = s1.length;
		int n2 = s2.length;
		if (n1 != n2)
			return false;

		Arrays.sort(s1);
		Arrays.sort(s2);

		for (int i = 0; i < n1; i++)
			if (s1[i] != s2[i])
				return false;
		return true;

	}

	// Bubble Sort

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

	// Insertion Sort

	public static void insertionSort1(int[] list) {

		int i, j, key, temp, w;

		{

			{
				for (i = 0; i < list.length; i++) {
					for (j = 0; j <= i; j++) {
						if (list[j] > list[i]) {
							temp = list[j];
							list[j] = list[i];
							for (w = i; w > j + 1; w--) {
								list[w] = list[w - 1];

							}
							list[w] = temp;

						}
					}

				}

			}
		}
		for (int i1 : list) {
			System.out.println(i1);
		}

	}

	// LOGIC FOR VENDING MACHINE

	public static void countCurreny(int amount) {
		int[] notes = new int[] { 1, 2, 5, 10, 50, 100, 500, 1000 };
		int[] noteCounter = new int[8];
		for (int i = 0; i <= 8; i++) {
			if (amount > notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];
			}

		}

		System.out.println("Currency Count ->");
		for (int i1 = 0; i1 < 9; i1++) {
			if (noteCounter[i1] != 0) {
				System.out.println(notes[i1] + " : " + noteCounter[i1]);

			}

		}
	}

	// logic to Farenhiet To celsius

	public static void temp_Convertion() {
		double fahrenhiet, celsius;
		int a = AlogorithmsLogic.getInt();
		switch (a) {

		case 1:

			System.out.println("enter the temperature in farenhiet");
			fahrenhiet = AlogorithmsLogic.getDouble();
			fahrenhiet = (fahrenhiet * 9 / 5) + 32;
			System.out.println("tempertaure in celcius" + fahrenhiet);
			break;

		case 2:
			System.out.println("enter the temperature in celcius");
			celsius = AlogorithmsLogic.getDouble();
			celsius = ((celsius - 32) * 5 / 9);
			System.out.println("temperature in fahrenhiet is" + celsius);
			break;

		}
	}

	// LOGIC TO MERGE SORT

	static void mergeSort(int[] arr1, int low, int high) {
		if (low == high)
			return;

		else {
			int mid = (low + high) / 2;
			mergeSort(arr1, low, high);
			mergeSort(arr1, mid + 1, high);
			mergeSort(arr1, low, mid + 1);

		}

	}
	// Binary Search

	public static int binarySearch(String[] s, String word) {

		int l = s.length - 1;
		int nl = 0;
		while (nl <= l) {
			int m = (nl + l) / 2;
			int mid = word.compareTo(s[m]);
			if (mid == 0)
				return m;
			if (mid > 0)
				nl = m + 1;
			else
				l = m - 1;

		}

		return -1;
	}

	// LOGIC FOR MONTLY PAYMENT

	public static double montlyPayment(double p, double t, double r) {
		double n = 12 * t;
		double r0 = r / (12 * 100);
		double payment = p * r0 / 1 - Math.pow(1 + r0, -n);
		return payment;

	}

	// MERGE SORT
	// split the given array
	public static void merge(String[] names) {
		if (names.length >= 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];
			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
			}
			merge(left);
			merge(right);
			mergeSort(names, left, right);
		}
	}

	// sort and merge
	public static void mergeSort(String[] names, String[] left, String[] right) {

		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}

	// LOGIC TO SQRT

	public static void sqrt(double c) {

		double t = c;
		double epsilon = (1e-5);
		while (Math.abs(t - c / t) > epsilon * t) {
			t = ((c / t) + t) / 2;

		}

		System.out.println(t);

	}

	// LOGIC TO CONVERT BINARY TO DECIMAL

	public static void binToDec(int num) {
		String sum = "";
		while (num > 0) {
			sum = num % 2 + sum;
			num = num / 2;
		}
		System.out.println(sum);

	}

	// LOGIC TO PRINT ANAGRAM AND PALINDROME

	public static void palindrome(ArrayList<Integer> a) {
		System.out.println("palindrome numbers from 1 to N:");
		for (int i = 0; i < a.size(); i++) {
			int rev = 0;
			int n = a.get(i);
			int m = a.get(i);

			while (n > 0) {
				int b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == m) {
				System.out.println(rev + " ,");
			}
		}

	}

	public static void primeAnagrams(ArrayList<Integer> a) {

		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {

				if (AlogorithmsLogic.isAnagram(a.get(i), a.get(j))) {
					System.out.println(a.get(i) + " " + a.get(j));
				}
			}
		}
	}

	// CHECKING THE ANAGRAMS OF THE NUMBERS

	public static boolean isAnagram(int n1, int n2) {
		int[] num1 = intArray(n1);
		int[] num2 = intArray(n2);
		if (num1.length != num2.length)
			return false;
		else {
			for (int i = 0; i < num1.length; i++) {
				if (num1[i] != num2[i])
					return false;
			}
		}
		return true;
	}

	
	// logic to print the count
	public static int[] intArray(int n1) {
	int [] count=new int[10];
	int temp=n1;
	while(temp!=0){
		int r=temp%10;
		
		count[r]++;
		temp=temp/10;
	}
	
		return count;
	}

	// logic TO PRINT THE PRIME NUMBERS

	public static ArrayList<Integer> primeNumber(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int i, j, k;
		for (i = 2; i <= n; i++) {
			k = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}
			}

			if (k == 0) {
				a.add(i);
			}

		}
		return a;

	}
	
	
// UTILITY CLASS
	//BINARY SEARCH
	public static <T extends Comparable<T>> T[] binarySearch(T[] array, T search){
		Arrays.sort(array);
		int length=array.length-1;
		int newlength=0;
		
		while(newlength<=length)
		{
			
			int mid=(length+newlength)/2;
			if(array[mid].equals(search)){
				
				System.out.println(search + "found in" + mid);
				break;
			}
			else if(search.compareTo(array[mid])>0)
			{
				newlength=mid+1;
			}
			else
				length=mid-1;
				
		}
		if(newlength>length)
		{
			System.out.println("element is not present");
		}
		
		return array;
		
	}
		

	
	//UTILITY CLASS
		// BINARY SEARCH
		public static <T extends Comparable<T>> T[] binSearch(T[] array, T search) {
			Arrays.sort(array);
			int length = array.length - 1;
			int newlength = 0;

			while (newlength <= length) {
				int mid = (length + newlength) / 2;
				if (array[mid].equals(search)) {
					System.out.println(search + "found in" + mid);
					break;
				} else if (search.compareTo(array[mid]) > 0) {
					newlength = mid + 1;
				} else
					length = mid - 1;

			}
			if (newlength > length) {
				System.out.println("element is not present");
			}

			return array;
		}

		// INSERTION SORT GENERIC
		public static <T extends Comparable<T>> T[] insertSort(T[] array) {
			int n = array.length;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (array[i].compareTo(array[j]) > 0) {
						T t = array[i];
						array[i] = array[j];
						array[j] = t;
					}
				}
			}

			return array;
		}
		// BUBBLE SORT GENERIC

		public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = 0; j < array.length - 1 - i; j++) {
					if (array[j].compareTo(array[j + 1]) > 0) {
						T t = array[j];
						array[j] = array[j + 1];
						array[j + 1] = t;

					}
				}
			}

			return array;
		}
		
		
		
	
		//INTEGER ARRAY
		public static Integer[] intArray1(int n) {
			Integer[] array = new Integer[n];
			System.out.println("enter elements");
			for (int i = 0; i < n; i++) {
				array[i] = AlogorithmsLogic.getInt();
			}
			return array;
		}

		
		
//String array
		public static String[] strArray(int n)
		{
			String[] strArray=new String[n];
			System.out.println("enter elements");
			for(int i=0;i<n;i++)
			{
				strArray[i]=AlogorithmsLogic.getString();
			}
			return strArray;
		}
		
		
		
	// Anagram for Interger
		
		public static boolean isAnagram1(int n1,int n2)
		{
			
			  int num1[]=intArray(n1);
			  int num2[]=intArray(n2);
			  if(num1.length!=num2.length)
			return false;
			  else
			  {
				  for(int i=0;i<num1.length;i++)
				  {
					  if(num1[i]!=num2[i])
					  {
						  return false;
					  }
				  }
			  }
			return true;
			
			
		}

		public static void primeAnagram(ArrayList<Integer> a) {
			// TODO Auto-generated method stub
			
			for(int i=0;i<a.size();i++)
			{
				for(int j=i+1;j<a.size();j++)
			
			{
				if(isAnagram1(a.get(i),a.get(j)))
						{
							System.out.println(a.get(i)+ " "+a.get(j));
						}
			}
			
		}
		
		
	

}
}
	







