import java.util.Scanner;

public class SortThreeNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double[] numbers = new double[3];
    int count = 1;
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter " + count + " number: ");
      numbers[i] = input.nextDouble();
      count++;
    }
    displaySortedNumbers(numbers);
  }

  public static void displaySortedNumbers(double[] numbers) {
    int n = numbers.length;
    for (int i = 0; i < n; i++) {
      int min_index = i;
      for (int j = i + 1; j < n; j++) {
        if (numbers[j] < numbers[min_index]) {
          min_index = j;
        }
      }

      double temp = numbers[min_index];
      numbers[min_index] = numbers[i];
      numbers[i] = temp;
    }
    System.out.println("----");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
