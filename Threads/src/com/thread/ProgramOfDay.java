package com.thread;

public class ProgramOfDay {

	public static void main(String[] args) {
		System.out.println(dayOfProgrammer(1800));
	}
	
	static String dayOfProgrammer(int year) {
		if(year==1918) {
			return "26.09."+year;	
		}else if(year==1800 || year==1700) {
			return "12.09."+year;
		}
		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				// year is divisible by 400, hence the year is a leap year
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;
		if (leap)
			return "12.09."+year;
		else
			
			return"13.09."+year;
		
	}

}
