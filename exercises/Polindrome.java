import java.util.Scanner;

public class Polindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // START 3-digits Polindrome

    // System.out.println("Enter a three-digit integer: ");
    // Integer number = input.nextInt();
    //
    // System.out.println(((number / 100) == (number % 10)) ? "Polindrome" : "Not a Polindrome");

    // END

    System.out.println("Enter a string: ");
    String s = input.nextLine();

    int low = 0;
    int high = s.length() - 1;

    boolean isPolindrome = true;
    while (low < high) {
      if (s.charAt(low) != s.charAt(high)) {
        isPolindrome = false;
        break;
      }
      low++;
      high--;
    }

    // if (isPolindrome)
    //   System.out.println(s + " is a palindrome");
    // else
    //   System.out.println(s + " is not a palindrome");

    System.out.println( isPolindrome ? s + " is a palindrome" : s + " is not a palindrome" );
  }
}
