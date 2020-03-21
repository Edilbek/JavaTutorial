import java.util.Scanner;

public class SumOfDigisInToInt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int digit = input.nextInt();

    System.out.println("Sum of digits: " + sumDigits(digit));
  }

  public static int sumDigits(long n) {
    int digit = 0;
    int sum = 0;

    while (Long.toString(n).length() != 1) {
      digit = (int) n % 10;
      n /= 10;
      sum += digit;
    }

    return sum + (int) n;
  }
}
