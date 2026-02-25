package day11;

import java.util.Scanner;

public class TurfDriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer customer=new Customer();
		System.out.println("Enter Customer Name");
		customer.setName(sc.next());
		
		System.out.println("Enter Date Of Play");
		customer.setDateOfPlay(sc.next());
		
		System.out.println("Enter Time Of Play");
		customer.setTimeOfPlay(sc.next());
		
		System.out.println("Choose Turf");
		System.out.println("1. Cricket Turf");
		System.out.println("2. Football Turf");
		System.out.println("3. Tennis Turf");
		
		int turfChoice=sc.nextInt();
		Turf turf=TurfManager.getTurf(turfChoice);
		
		printBill(customer,turf);
		
	}

	private static void printBill(Customer customer, Turf turf) {
		System.out.println("***ABC Turf***");
		System.out.println("Customer Name "+customer.getName());
		System.out.println("Date of Play "+customer.getDateOfPlay());
		System.out.println("Time of Play "+customer.getTimeOfPlay());
		System.out.println("Court Type "+turf.getTurfType());
		System.out.println("Price "+turf.getTurfPrice());
	}

}
