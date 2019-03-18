package com.BridgeLabs.algorithms;

import com.BridgeLabs.Util.AlogorithmsLogic;

public class DayOfTheWeek {
	
	public static void main(String[] args) {
		int year=AlogorithmsLogic.getInt();
		int month=AlogorithmsLogic.getInt();
		int date=AlogorithmsLogic.getInt();
		if(month>0&&month<12)
		{
			if(date>0&&date<31)
				
			{
				int y0 =year -(14- month)/12;
				int x= y0 + y0/4 -y0/100+y0/400;
				int m0=month+12 * ((14-month)/12)-2;
				int d0=(date + x +31 *m0 /12) %7;
				if(d0>=0&&d0<7)
				{
					int day=d0;
					switch(day)
					{
					case 0:
							System.out.println("sunday");
						    break;
						case 1:
							System.out.println("monday");
							break;
							
						case 2:
							System.out.println("Tuesday");
							break;
							
						case 3:
							System.out.println("Wednesday");
							break;
							
						case 4:
							System.out.println("Thursday");
							break;
						case 5:
							System.out.println("Friday");
							break;
						case 6:
							System.out.println("saturday");
							break;
									
					}
				}
			else
				System.out.println("not valid");
			
}
	}

	}
}
