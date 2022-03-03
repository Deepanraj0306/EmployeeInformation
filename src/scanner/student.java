package scanner;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Student id is:");
		int id = s.nextInt();
		System.out.println("Student id is:"+id);
		
		System.out.println("Student Name is:");
		String name = s.next();
		System.out.println("Student Name is:"+name);
		
		System.out.println("Student Mark1 is:");
		byte mark1 = s.nextByte();
		System.out.println("Student Mark1 is:"+mark1);
		
		System.out.println("Student Mark2 is:");
		byte mark2 = s.nextByte();
		System.out.println("Student Mark2 is:"+mark2);
		
		System.out.println("Student Mark3 is:");
		byte mark3 = s.nextByte();
		System.out.println("Student Mark3 is:"+mark3);
		
		System.out.println("Student Mark4 is:");
		byte mark4 = s.nextByte();
		System.out.println("Student Mark4 is:"+mark4);
		
		System.out.println("Student Mark5 is:");
		byte mark5 = s.nextByte();
		System.out.println("Student Mark5 is:"+mark5);
		
		System.out.println("Student total Marks:");
		int total = s.nextInt();
		int avg=s.nextInt();
		System.out.println("Student total Marks:"+total+"\nAverage mark is:"+avg);
		
		
	}
	
	
}
