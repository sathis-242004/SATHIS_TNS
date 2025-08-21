package assingnment2;

import java.util.Scanner;

class circle{
	double radius;
	String color;
	
	void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        radius = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter color of the circle: ");
        color = sc.nextLine();
	}
	void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Color of the circle: " + color);
        System.out.println("Area of the circle: " + area);
    }
}

public class datamembers {
	 public static void main(String[] args) {
	       circle c = new circle();
	       c.getInput();
	       c.calcArea();
	 }
}
	 
	   

