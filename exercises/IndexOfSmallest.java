import java.util.Scanner;

public class IndexOfSmallest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[10];

    System.out.println("Enter 10 numbers: ");

    for (int i = 0; i < array.length; i++)
      array[i] = input.nextInt();

      System.out.println("The minimum number is " +
  			array[indexOfSmallestElement(array)] + " index " +
  			indexOfSmallestElement(array));
  }

  public static int indexOfSmallestElement(int[] array) {
    if (array.length <= 1)
			return 0;

    int min = array[0];
    int smallIndex = 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
        smallIndex = i;
      }
    }
    return smallIndex;
  }
}
