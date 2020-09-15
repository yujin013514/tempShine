package ch091520;

public class DB {
	
	private final int SIZE = 5; //365;
	private double dbTemp[] = new double[SIZE];
	private double dbShine[] = new double[SIZE]; 
	
	
/*
 *  dbTemp	[] [] [] [] []
 *  dbShine [] [] [] [] []
 */
	
	public void setTemp(double temp, int index) {
		dbTemp[index] = temp;
	}
	
	public void setShine(double sunshine, int index) {
		dbShine[index] = sunshine;
	}
	
	public double getTemp(int index) {
		return dbTemp[index];
	}

	public double getSunshine(int index) {
		return dbShine[index];
	}
	
	public int getSize() {
		return SIZE;
	}
}
