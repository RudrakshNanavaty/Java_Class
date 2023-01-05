public class gb_Pass_by_Reference {

    String name = "Hello";

    void change(gb_Pass_by_Reference s2) {
        this.name = s2.name;
    }

    public static void main(String arg[]) {
        gb_Pass_by_Reference s2 = new gb_Pass_by_Reference();
        System.out.println("\nBefore: " + s2.name);
        s2.change(s2);
        System.out.println("After: " + s2.name + '\n');
    }
}
