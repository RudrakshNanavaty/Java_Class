import java.util.Scanner;

public class d_Percentage_Marks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float marks[] = new float[6];
		float averageMarks = 0;

		System.out.print("Enter 6 subject marks: ");
		for (int i = 0; i < 6; i++) {
			marks[i] = sc.nextInt();
			averageMarks += marks[i] / 6;
		}

		sc.close();

		System.out.println("Average Marks = " + averageMarks);
	}
}
