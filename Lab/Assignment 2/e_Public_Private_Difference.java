public class e_Public_Private_Difference {

	public static void main(String[] args) {

		// object instance
		Class o = new Class();

		System.out.println("Public String : " + o.Public);
		System.out.println("Private String: " + o.Private());

		System.out.println("\nTrying to change public string.");
		o.Public = "Changed Public";
		System.out.println("Done.");

		System.out.println("\nTrying to change private string.");
		System.out.println("Error. Cannot directly access private data.");
		System.out.println("Calling setter method.");
		o.setPrivate("Changed Private.");
		System.out.println("Done.");

		System.out.println("\nNew public String : " + o.Public);
		System.out.println("New private String: " + o.Private() + '\n');
	}
}

class Class {
	private String Private = "Its private";
	public String Public = "Hello Everyone";
	final String Final = "It iz what it iz";

	// constructor
	Class() {
	}

	// getter
	public String Private() {
		return Private;
	}

	// setter
	public void setPrivate(String str) {
		this.Private = str;
	}
}
