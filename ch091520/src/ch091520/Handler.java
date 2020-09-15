package ch091520;

import java.util.Scanner;

/*
 * 1. too many static
 *  	-> make different classes
 * 2. rep
 * 		-> put into one
 * 3. too long
 *     	-> make different classes 
 * 4. track 
 * 		-> DB (mySQL)
 * 		-> array
 * 		-> List
 */

public class Handler {
	static Scanner sc = new Scanner(System.in);
	static double sunshine;
	static double temp;
	static int day; 
	static final int DAY = 5;
	
	
	// count day
	public static void setDay() {
		Handler.day  = Handler.day + 1; // Handler.day += 1; // Handler.day ++;
	}
	
	// set sunshine
	public static void setSunshine() {
		System.out.print("Sunshine : ");
		double sunshine = sc.nextDouble();
		Handler.sunshine = Handler.sunshine + sunshine;
	}
	
	// set temp
	public static void setTemp() {
		System.out.print("Temp : ");
		double temp = sc.nextDouble();
		Handler.temp = Handler.temp + temp;
	}
	
	public static double getTotalSunshine() {
		return sunshine;
	}
	
	public static double getTotalTemp() {
		return temp;
	}
	
	public static double calSunshine() {
		return sunshine / day;
	}
	
	public static double calTemp() {
		return temp / day;
	}
	
	public static void trial() {
		for(int i = 0; i < DAY; i ++) {
			setDay();
			setSunshine();
			setTemp();
		}	
	}
	
	
	public static void show() {
		System.out.println("average temp : " + calTemp());
		System.out.println("average sunshine : " + calSunshine());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trial();
		show();

	}

}
