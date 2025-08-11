package inheritance;

public class HierarchicalInhDemo {

	public static void main(String[] args) {
		person p1 = new person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		person p;
		p = new person("Dhruv", "Mumbai");
		if (p instanceof person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new student("Pankaj", "Pune", "FE", 88);
		if (p instanceof student)
			System.out.println("Student Details "+p);

	}




}
