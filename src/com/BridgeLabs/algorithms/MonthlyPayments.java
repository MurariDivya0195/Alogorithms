package com.BridgeLabs.algorithms;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class MonthlyPayments {
	
	public static void main(String[] args) {
		
		double p= Double.parseDouble(args[0]);
		double t=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		
		System.out.println("montly payment is " + AlogorithmsLogic.montlyPayment(p, t, r));
		
		
		
		
		
	}

}
