public class ReverseEnteredNumbers {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int start = 0;
    int end = numbers.length - 1;

    reverseNumbers(numbers, start, end);
    printArray(numbers);
  }

  public static void reverseNumbers(int[] numbers, int start, int end) {
    int temp;

    // Start of iterative way

    while (start < end) {
      temp = numbers[start];
      numbers[start] = numbers[end];
      numbers[end] = temp;
      start++;
      end--;
    }

    // End

    // Start of recursive way

    // while (start >= end) {
    //   return;
    // }
    // temp = numbers[start];
    // numbers[start] = numbers[end];
    // numbers[end] = temp;
    // reverseNumbers(numbers, start + 1, end - 1);

    // End
  }

  public static void printArray(int[] numbers) {
    for (int e: numbers) {
      System.out.println(e);
    }
  }
}
