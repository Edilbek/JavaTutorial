import java.util.Scanner;

public class AverageAnArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] array = new double[10];

    System.out.println("Enter the 10 double elements: ");
    for (int i = 0; i < 10; i++)
      array[i] = input.nextDouble();

    System.out.printf("The average is: %.2f", average(vals));
  }

  public static double average(double[] array) {
    double sum = 0;
    for (int i = 0; i < array.length; i++)
      sum += i;
    return sum / array.length;
  }

  public static double average(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++)
      sum += i;
    return sum / array.length;
  }
}
