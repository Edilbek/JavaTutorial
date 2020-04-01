import java.util.Scanner;

public class Pass2dArrayToMethod {
  public static void main(String[] args) {
    int[][] array = getArray();

    System.out.println("Sum of all elements: " + sum(array));
  }

  public static int[][] getArray() {
    Scanner input = new Scanner(System.in);

    int[][] array = new int[3][4];

    System.out.println("Enter " + array.length + " rows and " + array[0].length + " columns: ");

    for (int row = 0; row < array.length; row++)
      for (int col = 0; col < array[row].length; col++)
        array[row][col] = input.nextInt();

    return array;
  }

  public static int sum(int[][] array) {
    int sum = 0;
    for (int row = 0; row < array.length; row++)
      for (int col = 0; col < array[row].length; col++)
        sum += array[row][col];

    return sum;
  }
}
