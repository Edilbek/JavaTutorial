import java.util.Scanner;

public class QuadraticEquations {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    print("ax^2 + bx + c = 0");
    print("Enter a, b, c: ");
    float a, b, c, r1, r2, pow2, d, sqrt;

    a = input.nextFloat();
    b = input.nextFloat();
    c = input.nextFloat();

    pow2 = (float) Math.pow(b, 2);
    d = pow2 - 4 * a * c;
    sqrt = (float) Math.sqrt(d);

    if (d >= 1) {
      r1 = (-b + sqrt) / (2 * a);
      r2 = (-b - sqrt) / (2 * a);
      print("The equation has two roots" + " " + r1 + " and " + r2);
    }
    else if (d == 0) {
      r1 = (-b + sqrt) / (2 * a);
      print("The equation has one root " + r1);
    }
    else {
      print("The equation has no real roots");
    }
  }

  public static void print(Object text) {
    System.out.println(text);
  }
}
