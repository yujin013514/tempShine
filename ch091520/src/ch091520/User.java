package ch091520;

import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	DB db = new DB();
	Cal cal = new Cal();
	double totalTemp;
	double totalShine;
	int index;
	
	
	public void setTemp() {
		System.out.print("Temp : ");
		double temp = sc.nextDouble();
		totalTemp = totalTemp + temp;
		db.setTemp(temp, index);
	}
	
	public void setShine() {
		System.out.print("Shine : ");
		double sunshine = sc.nextDouble();
		totalShine = totalShine + sunshine;
		db.setShine(sunshine, index);
	}
	
	public void set() {
		setTemp();
		setShine();
		index = index + 1;
	}
	
	public void show() {
		for( int i=0; i<db.getSize(); i++) {
			System.out.print("Day(" + (i+1) + ")\t");
			System.out.print("Shunsine : " + db.getSunshine(i)+"\t");
			System.out.println("Temp : " + db.getTemp(i));			
		}
		
		System.out.println("AvgTemp : " + cal.calAvg(totalTemp, db.getSize()));
		System.out.print("AvgShine: " + cal.calAvg(totalShine, db.getSize()));
	}
	
	public static void main(String[] args) {
		User user = new User();
		
		for(int i=0; i<user.db.getSize(); i++) {
			user.set();			
		}
		
		user.show();
	}

}
