package assingnment2;

import java.util.Scanner;

class student{
	student(){
		System.out.println("student objecct is created");
	}
}
class commision{
	String name;
	String address;
	String phonenumber;
	double salesamount;
	
	void acceptdetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your name");
		name = sc.nextLine();
		System.out.print("enter your address");
		address = sc.nextLine();
		System.out.print("enter your phonenumber");
		phonenumber = sc.nextLine();
		System.out.print("enter your salesamount");
		salesamount = sc.nextDouble();
		
	}
	void calculateCommission() {
        double commission = 0;

        if (salesamount >= 100000) {
            commission = 0.10 * salesamount;
        } else if (salesamount >= 50000) {
            commission = 0.05 * salesamount;
        } else if (salesamount >= 30000) {
            commission = 0.03 * salesamount;
        }

        System.out.println("Commission for " + name + ": ₹" + commission);
    }
}
	
	



public class studentcommisiondetails {
	public static void main(String[]args){
	student s = new student();
	
	commision emp = new commision();
    emp.acceptdetails();
    emp.calculateCommission();
	}

}
