package icp.lab1;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Question3 {
	//creating scanner to accept input
	Scanner scanner = new Scanner(System.in);
	double r;
	double area;
	double circ;

	/*
	 * Theses are the getters and setters for the circle dimensions
	 */
	
	//get the radius
	public double getR() {
		return r;
	}
	//set the radius
	public void setR(double r) {
		this.r = r;
	}
	//get the AREA
	public double getArea() {
		return area;
	}
	//get the circumference
	public double getCirc() {
		return circ;
	}

	//this is the toString method that help to return the final results to the use
	@Override
	public String toString() {
		return "Your circle has: " + "\n" +
				"Radius: " + r + "cm" + "\n" +
				"Area: " + area + "cm squared" + "\n" +
				"Circumference: " + circ + "cm";
	}
	
	//this method helps in rounding the acquired figures from the user
	public static double round(double value, int places) {
	    double scale = Math.pow(10, places);
	    return Math.round(value * scale) / scale;
	}

	//this is the method that performs the computation of the area and circumference
	public void circle() {
		System.out.println("Enter the radius of the circle in centimeters");
		r = scanner.nextDouble();
		
		//formula for area of the circle
		double a = r*r*(22/7);
		//formula for circumference of the circle
		double c = 2 * r * (22/7);
		//rounding the area of the circle
		area = round(a, 2);
		//rounding the circumference of the circle
		circ = round(c, 2);
		
		//final print statement
		System.out.println(toString());
		
	}
	
	

	public static void main(String[] args) {
		//instantiation of the test variable
		Question3 test1 = new Question3();
		
		//making a call to the circle method to accept the inputed radius and output the radius and the circumference
		test1.circle();
		
	}
}
