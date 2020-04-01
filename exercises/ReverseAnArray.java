import java.util.Scanner;

public class ReverseAnArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[10];

    System.out.println("Enter 10 numbers: ");
    for (int i = 0; i < array.length; i++)
      array[i] = input.nextInt();

    printArray(reverseArray(array));
  }

  public static void printArray(int[] array) {
    for (int e: array)
      System.out.print(e + " ");
      System.out.println();
  }

  public static int[] reverseArray(int[] array) {
    int[] reversedArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      reversedArray[i] = array[array.length - 1 - i];
    }

    return reversedArray;
  }
}
