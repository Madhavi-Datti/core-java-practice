package com.enums;
enum Days{
	SUNDAY,MONDAY,TUESDAY,WEDNESSDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class Enums1 {
	public static void main(String[] args) {
//		Days[] d = Days.values();
//		for(Days wd:d)
//		{
//			System.out.println(wd);
//		}			
		Days d = Days.SUNDAY;
		switch(d)
		{
		case SUNDAY:System.out.println("HOLIDAY");
		break;
		case MONDAY:System.out.println("no");
		break;
		case TUESDAY:System.out.println("no");
		break;
		case WEDNESSDAY:System.out.println("no");
		break;
		case THURSDAY:System.out.println("no");
		break;
		case FRIDAY:System.out.println("no");
		break;
		case SATURDAY:System.out.println("no");
		break;
		default: System.out.println("no");			
	}	
	}
}
