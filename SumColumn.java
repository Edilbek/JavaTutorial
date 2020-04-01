import java.util.Scanner;

public class SumColumn {
  public static void main(String[] args) {
    double[][] matrix = getArray();

    System.out.println("-------");
    for (int col = 0; col < matrix[0].length; col++) {
			System.out.println(
				"Sum of the elements at column " + col +
				" is " + sumColumn(matrix, col));
		}
  }

  public static double[][] getArray() {
    Scanner input = new Scanner(System.in);
    double[][] matrix = new double[3][4];

    System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");

    for (int row = 0; row < matrix.length; row++)
      for (int col = 0; col < matrix[row].length; col++)
        matrix[row][col] = input.nextDouble();

    return matrix;
  }

  public static void printArray(double[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static double sumColumn(double[][] matrix, int columnIndex) {
    double sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			sum += matrix[row][columnIndex];
		}
		return sum;
  }
}
