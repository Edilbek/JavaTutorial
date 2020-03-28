import java.util.Scanner;

public class CountOccurrenceOfNumbers {
  public static void main(String[] args) {
    int[] array = new int[10];

    fillArray(array);
    CountOccurrence(selectionSort(array));
  }
  public static void fillArray(int[] array) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the 10 elements between 1-100: ");
    for (Integer i = 0; i < array.length; i++) {
      array[i] = input.nextInt();
    }
  }

  public static void CountOccurrence(int[] array) {
    for (int e: array)
      System.out.print(e + " ");
      System.out.println("");

    for (int i = 1; i <= 100; i++) {
      int count = 0;

      for (int j = 0; j < array.length; j++) {
        if ( i == array[j] ) {
          count++;
        }
      }
      if (count != 0)
        System.out.printf("%d occurs %d %s%n", i, count, count > 1 ? "times" : "time");
    }
  }

  public static int[] selectionSort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum int the list[i..list.length-1]
      int currentMin = list[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }

    return list;
  }
}
