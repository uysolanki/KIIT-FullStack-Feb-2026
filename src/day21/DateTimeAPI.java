package day21;

import static java.time.LocalDate.now;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {

	public static void main(String[] args) {
		LocalDate todaysDate = now();
		LocalDate subscriptionDate = LocalDate.of(2025, 12, 25);
		LocalDate subscriptionExpiryDate=subscriptionDate.plusYears(1);
		
		System.out.println(todaysDate);
		if(subscriptionExpiryDate.isAfter(todaysDate))
			System.out.println("ACTIVE");
		else
			System.out.println("EXPIRED");
		
		//subscription  25-Dec-2025  1 year 
		
		LocalDate date = LocalDate.now();
		String formatedDate=date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(formatedDate);
		
		
		String s = "2025/03/13";
		LocalDate date1 = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		String formatedDate1=date1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(formatedDate1);

	}

}
