import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    print("Enter the size of array: ");
    int size = input.nextInt();
    int[] list = new int[size];

    fillArray(list, size, input);

    print("----------");
    printArray(list);
    print("----------");

    print("Enter the key for search: ");
    int key = input.nextInt();
    linearSearch(list, key);
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

  public static void linearSearch(int[] list, int key) {
    for (int i = 0; i < list.length; i++) {
      if (key == list[i]) {
        print("Found: " + i);
      }
    }
  }

  public static void print(Object text) {
    System.out.println(text);
  }
}
