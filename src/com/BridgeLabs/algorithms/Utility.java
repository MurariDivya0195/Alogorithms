package com.BridgeLabs.algorithms;

import java.security.AlgorithmConstraints;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class Utility {

	public static void main(String[] args) {
		
		System.out.println("enter 1:Binary Search 2:Insertion Sort 3:Bubble Sort");
		int type = AlogorithmsLogic.getInt();
		switch (type) {
		case 1: {
			System.out.println("enter 1 for integer and 2 for string");
			int select = AlogorithmsLogic.getInt();
			long startTime = System.nanoTime();
			System.out.println("enter number of elements");
			int n = AlogorithmsLogic.getInt();
			switch (select) {
			case 1:
				Integer[] array = AlogorithmsLogic.intArray1(n);
				System.out.println("enter to search");
				int search = AlogorithmsLogic.getInt();
				AlogorithmsLogic.binarySearch(array, search);
				break;
			case 2:
				String[] strArray = AlogorithmsLogic.strArray(n);
				System.out.println("enter to search");
				String strSearch =  AlogorithmsLogic.getString();
				 AlogorithmsLogic.binarySearch(strArray, strSearch);
				break;
			default:
				System.out.println("invalid input");
			}
			long endTime = System.nanoTime();
			long elapsedTime = endTime-startTime;
			System.out.println("elapsed time for binary search is" + elapsedTime);
			break;
		}
		case 2: {
			System.out.println("enter 1 for integer and 2 for string");
			int select =  AlogorithmsLogic.getInt();
			long startTime = System.nanoTime();
			System.out.println("enter number of elements");
			int n =  AlogorithmsLogic.getInt();
			switch (select) {
			case 1:
				Integer[] array = AlogorithmsLogic.intArray1(n);
				System.out.println("sorted array");
				Integer[] sortArray =  AlogorithmsLogic.insertSort(array);
				for (Integer elements : sortArray) {
					System.out.println(elements);
				}
				break;
			case 2:
				String[] strArray =  AlogorithmsLogic.strArray(n);
				System.out.println("sorted array");
				String[] sortedArray =  AlogorithmsLogic.insertSort(strArray);
				for (String elements : sortedArray) {
					System.out.println(elements);
				}
				break;
			default:
				System.out.println("invalid input");
			}
			long endTime = System.nanoTime();
			long elapsedTime = endTime-startTime;
			System.out.println("elapsed time for insertion sort is" + elapsedTime);
			break;
		}
		case 3: {
			System.out.println("enter 1 for integer and 2 for string");
			int select =  AlogorithmsLogic.getInt();
			long startTime = System.nanoTime();
			System.out.println("enter number of elements");
			int n =  AlogorithmsLogic.getInt();
			switch (select) {
			case 1:
				Integer[] array =  AlogorithmsLogic.intArray1(n);
				System.out.println("sorted array");
				Integer[] sortArray =  AlogorithmsLogic.bubbleSort(array);
				for (Integer elements : sortArray) {
					System.out.println(elements);
				}
				break;
			case 2:
				String[] strArray =  AlogorithmsLogic.strArray(n);
				System.out.println("sorted array");
				String[] sortedArray = AlogorithmsLogic.bubbleSort(strArray);
				for (String elements : sortedArray) {
					System.out.println(elements);
				}
				break;
			default:
				System.out.println("invalid input");
			}
			long endTime = System.nanoTime();
			long elapsedTime = endTime-startTime;
			System.out.println("elapsed time for bubble sort is" + elapsedTime);
			break;
		}
		default:
			System.out.println("invalid input");
		}

	}		
	}

