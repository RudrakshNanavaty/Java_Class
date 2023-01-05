public class ga_Pass_by_Value {

	String name = "Hello";

	void change(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ga_Pass_by_Value a1 = new ga_Pass_by_Value();
		System.out.println("\nOld Name: " + a1.name);
		a1.change("World");
		System.out.println("New Name: " + a1.name + '\n');
	}
}
