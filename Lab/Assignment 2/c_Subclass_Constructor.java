import java.util.Scanner;

public class c_Subclass_Constructor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// inputs
		System.out.print("Employee's name  : ");
		String employeeName = scan.nextLine();

		System.out.print("Employee's age   : ");
		int employeeAge = scan.nextInt();
		System.out.println();
		scan.nextLine();

		System.out.print("Teacher's name   : ");
		String teacherName = scan.nextLine();

		System.out.print("Teacher's age    : ");
		int teacherAge = scan.nextInt();
		scan.nextLine();

		System.out.print("Teacher's subject: ");
		String teacherSubject = scan.next();
		System.out.println();

		// object instances
		Employee e = new Employee(employeeName, employeeAge);

		Teacher t = new Teacher(teacherName, teacherSubject, teacherAge);

		scan.close();

		// outputs
		System.out.println(e.name() + " is " + e.age() + " yrs. old.");

		System.out.println(
				t.name() + " is " + t.age() + " yrs. old and teaches " + t.subject() + ".");

	}
}

class Employee {
	private String name;
	private int age;

	// constructor
	public Employee(String name, int exp) {
		this.name = name;
		this.age = exp;
	}

	// getters
	public String name() {
		return this.name;
	}

	public int age() {
		return this.age;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setExp(int exp) {
		this.age = exp;
	}
}

class Teacher extends Employee {
	private String subject;

	// constructors
	public Teacher(String name, int age) {
		super(name, age);
		this.subject = "Not Assigned";
	}

	public Teacher(String name, String subject, int age) {
		super(name, age);
		this.subject = subject;
	}

	// getter
	public String subject() {
		return this.subject;
	}

	// setter
	public void assignSubject(String subject) {
		this.subject = subject;
	}
}
