import java.util.Scanner;

public class CheckPassword {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the password: ");
    String password = input.next();

    checkPassword(password);
  }

  public static void checkPassword(String password) {
    boolean isValid = password.matches("(?=(.*?\\d){2})[a-zA-Z0-9]{8,}") ? true : false;

    System.out.println(isValid ? "Valid Password!" : "Invalid Password!");
  }
}
