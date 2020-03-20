import java.util.Scanner;

public class DisplayPyramid {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of lines: ");
    int inputNum = input.nextInt();
    int i, j, k = 0;
    System.out.println("-----------------");

    for (i = 1; i <= inputNum; i++) {
      for (j = 1; j < inputNum - 1; j++) {
        System.out.print(" ");
      }
      while (k != i) {
        System.out.print(k + 1 + " ");
        k++;
      }
      k = 0;
      System.out.println();
    }
  }
}
