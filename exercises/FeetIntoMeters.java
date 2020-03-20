import java.util.Scanner;

public class FeetIntoMeters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float feet, meters, foot;
    foot = (float) 0.305;

    print("Enter a value for feet: ");
    feet = input.nextFloat();

    meters = feet * foot;

    print(feet + " feet is " + meters + " meters");
  }

  public static void print(Object text) {
    System.out.println(text);
  }
}
