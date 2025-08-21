package studentdetails;

import java.util.Scanner;

public class studentdetails {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("write full name with initial");
		String fullname = scanner.nextLine();
		System.out.print("enter your roll name");
		String rollnumber = scanner.nextLine();
		System.out.print("enter your grade");
		String grade = scanner.nextLine();
		System.out.print("enter your percentage");
		double percentage = scanner.nextDouble();
		System.out.println("\n--- Student Details ---");
        System.out.println("Full Name     : " + fullname);
        System.out.println("Roll Number   : " + rollnumber);
        System.out.println("Grade         : " + grade);
        System.out.println("Percentage    : " + percentage + "%");
		
		
	}

}

