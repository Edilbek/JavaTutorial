import java.util.Scanner;

public class ScannerInput {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number for radius: ");
    double radius = input.nextDouble();
    double area = radius * radius * 3.14159;

    System.out.println(area);
  }
}
