import java.util.Scanner;

public class VolumeOfCylinder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the radius and length of a cylinder: ");
    double radius = input.nextDouble();
    double length = input.nextDouble();

    double area = radius * radius * 3.14159265;
    double volume = area * length;

    System.out.println("The area is: " + area);
    System.out.println("The volume is: " + volume);
  }
}
