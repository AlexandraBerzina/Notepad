package by.epam.tr.main;

import java.util.Scanner;

public class Correctness {
	
	
	public static String checkCorStr() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextLine()) {
	        System.out.println("That not a string!");
	        sc.next(); 
	    }
		String res = sc.nextLine();
		return res;
	}
	
	public static int checkCorInt() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
	        System.out.println("That not a number!");
	        sc.next(); 
	    }
		int res = sc.nextInt();
		return res;
	}
	
	public static double checkCorDouble() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextDouble()) {
	        System.out.println("That not a double number!");
	        sc.next(); 
	    }
		double res = sc.nextDouble();
		return res;
	}

}