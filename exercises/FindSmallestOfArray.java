import java.util.Scanner;

public class FindSmallestOfArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] array = new double[10];

    System.out.println("Enter 10 numbers: ");

    for (int i = 0; i < array.length; i++)
      array[i] = input.nextDouble();

    System.out.println("The minimum number: " + min(array));
  }

  public static double min(double[] array) {
    double min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min)
        min = array[i];
        
    return min;
  }
}
