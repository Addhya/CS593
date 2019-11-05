import java.util.*;
import java.io.*;

class MyExcep extends Exception {
	public MyExcep(String s){
		super(s);
	}
}

class ErrorHandling {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int divident, divisor, rem = 0, quo = 0;
		System.out.println("Enter Divisor");
		divisor = sc.nextInt();
		System.out.println("Enter Divident");
		divident = sc.nextInt();


		try {
			if(divisor == 0)
			throw new MyExcep("cannot divide by zero");
			quo = divident / divisor;
			rem = divident % divisor;
			System.out.println("quotient = " + quo);
			System.out.println("remainder = " + rem);

		}			
		catch (MyExcep e) {
			System.out.println(e.getMessage());
		}
		
	}
}