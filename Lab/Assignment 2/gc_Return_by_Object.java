public class gc_Return_by_Object {
	int n;

	public gc_Return_by_Object(int n) {
		this.n = n;
	}

	static gc_Return_by_Object returnobj(gc_Return_by_Object a, gc_Return_by_Object b) {
		if (a.n < b.n) {
			gc_Return_by_Object obj = new gc_Return_by_Object(a.n);
			return obj;
		} else {
			gc_Return_by_Object obj = new gc_Return_by_Object(b.n);
			return obj;
		}

	}

	public static void main(String arg[]) {
		gc_Return_by_Object a4 = new gc_Return_by_Object(7);
		gc_Return_by_Object a5 = new gc_Return_by_Object(2);
		System.out.println("\nMinimum is : " + gc_Return_by_Object.returnobj(a4, a5).n + '\n');
	}
}
