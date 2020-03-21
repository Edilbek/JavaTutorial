import java.util.Scanner;

public class ReverseInteger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the integer: ");
    int number = input.nextInt();

    reverse(number);
  }

  public static void reverse(int number) {
    int temp;
    int rev = 0;
    while (number != 0) {
      temp = number % 10;
      rev = rev * 10 + temp;
      number /= 10;
    }
    System.out.println(rev);
  }
}
