import java.util.Arrays;
import java.util.Scanner;

public class n_Matrix_Multiplication {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter dimensions: ");
		int rows = scan.nextInt();
		int columns = rows;

		int[][] matrix1 = new int[rows][columns];

		// Taking Inputs
		System.out.println("Enter the Elements of Matrix 1");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}

		System.out.println("\nEnter Elements of Matrix 2:");
		int[][] matrix2 = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix2[i][j] = scan.nextInt();
			}
		}

		scan.close();

		Multiply(matrix1, rows, columns, matrix2, rows, columns);
	}

	static void Multiply(int[][] matrix1, int m1_r, int m1_c, int[][] matrix2, int m2_r, int m2_c) {
		System.out.println("\nResult Matrix : ");
		if (m1_c == m2_r) {

			int[][] newMatrix = new int[m1_r][m2_c];
			for (int i = 0; i < m1_r; i++) {
				for (int j = 0; j < m2_c; j++) {
					for (int k = 0; k < m1_r; k++) {
						newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}

				System.out.println(Arrays.toString(newMatrix[i]));
			}
		}
	}
}
