package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=5;
		String dayName;
		if(day==1) {
			dayName="Monday";
		}else if(day==2) {
				dayName="Tuesday";
		}else if(day==3) {
			dayName="Wednesday";
		}else if(day==4) {
			dayName="Thursday";
		}else if(day==5) {
			dayName="Friday";
		}else if(day==6) {
			dayName="Saturday";
		}else if(day==7){
			dayName="Sunday";
		}else {
			dayName="Invalid";
			
			System.out.println("Today is "+dayName);
			
			System.out.println("------using switch");
			String today;
			switch(day) {
			case 1:
				today="Monday";
				break;
			case 2:
				today="Tuesday";
				break;
			case 3:
				today="Wednesday";
			case 4:
				today="Thursday";
			case 5:
				today="Friday";
			case 6:
				today="Saturday";
			case 7:
				today="Sunday";			
			default:
				today="Invalid";
				System.out.println("Today is "+today);
								
								
								
							}
		}
	}
}
					
	


