import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    print("Enter the size of array: ");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();

    int[] list = new int[size];

    fillArray(list, size, input);

    print("After selection sort: ");
    printArray(selectionSort(list));

    print("Enter the key: ");
    int key = input.nextInt();

    print("Binary bearch result: " + binarySearch(selectionSort(list), key));
  }

  public static void fillArray(int[] list, int size, Scanner input) {
    print("Fill array elements: ");

    for (int i = 0; i < size; i++) {
      list[i] = input.nextInt();
    }
  }

  public static void printArray(int[] list) {
    for (int e: list)
      System.out.print(e + " ");
      print("");
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

  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (key < list[mid]) {
        high = mid - 1;
      }
      else if (key == list[mid]) {
        return mid;
      }
      else {
        low = mid + 1;
      }
    }
    return -low - 1;
  }

  public static void print(Object text) {
    System.out.println(text);
  }
}
