package com.BridgeLabs.algorithms;

import java.util.Scanner;

public class DayOfTheWeek {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		boolean keepdoing=true;
		while(keepdoing){
			System.out.println("Month");
			int m=scanner.nextInt();
			if(m<1 || m>12)
			{
				System.out.println("months are between 1 and 12");
				continue;
			}
			System.out.println("Day");
			int d = scanner.nextInt();
			if(d < 1 || d<=31)
			{
				System.out.println("days are between 1  to 31");
				continue;
			}
			System.out.println("year");
			int year=scanner.nextInt();
			if(year <-10000 || year >10000)
			{
				System.out.println("years are between -10000 and 10000");
				continue;
			}
			
			
			int y0=year-(14-m)/12;
			int x = y0 + y0/4- y0/100+y0/400;
			int m0= m+12 *((14-m)/12)-2;
			int d0=(d+x+31*m0/12)%7;
			boolean c=0 <= d0 <= 6;
			if(c)
			{
				String b="Sunday";
			}
			else
			{
				if(c)
				{
					String b ="monday";
				}
				else
				{
					if(c)
					{
						String b="Tuesday";
					}
					else
					{
						if(c)
						{
							String b="wednesday";
						}
						else
						{
							if(c)
							{
								String b="Thursday";
							}
							else
							{
								if(c)
								{
									String b="Friday";
								}
								else
								{
									if(c)
									{
										String b="saturday";
									}
								}
							}
						}
					}
				}
			}
			System.out.println("The day of the day"+b);
		}
	}

}
