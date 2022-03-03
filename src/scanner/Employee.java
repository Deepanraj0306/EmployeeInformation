package scanner;

import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Employee id is:");
		int id = s.nextInt();
		System.out.println("Employee id is:"+id);
		
		System.out.println("Employee Name is:");
		String name = s.next();
		System.out.println("Employee Name is:"+name);
		
		System.out.println("Employee Email is:");
		String email = s.next();
		System.out.println("Employee Email is:"+email);
		
		System.out.println("Employee phone is:");
		long phone = s.nextLong();
		System.out.println("Employee Phone is:"+phone);
		
		System.out.println("Employee salary is:");
		float salary = s.nextFloat();
		System.out.println("Employee salary is:"+salary);
		
		System.out.println("Employee gender is:");
		String gen = s.next();
		System.out.println("Employee gender is:"+gen);
		
		System.out.println("Employee city is:");
		String city = s.next();
		System.out.println("Employee city is:"+city);
	}

}
