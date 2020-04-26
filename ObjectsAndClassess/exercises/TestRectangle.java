public class TestRectangle {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle();
    Rectangle rectangle2 = new Rectangle(4, 40);
    Rectangle rectangle3 = new Rectangle(3.5, 35.9);

    System.out.println("rec1 width is " + rectangle1.width);
    System.out.println("rec1 heigth is " + rectangle1.heigth);
    System.out.println("rec1 area is " + rectangle1.getArea());
    System.out.println("rec1 perimeter is " + rectangle1.getPerimeter());

    System.out.println("-------------------");

    System.out.println("rec2 width is " + rectangle2.width);
    System.out.println("rec2 heigth is " + rectangle2.heigth);
    System.out.println("rec2 area is " + rectangle2.getArea());
    System.out.println("rec2 perimeter is " + rectangle2.getPerimeter());

    System.out.println("-------------------");

    System.out.println("rec3 width is " + rectangle3.width);
    System.out.println("rec3 heigth is " + rectangle3.heigth);
    System.out.println("rec3 area is " + rectangle3.getArea());
    System.out.println("rec3 perimeter is " + rectangle3.getPerimeter());

    System.out.println("-------------------");
  }
}

class Rectangle {
  double width, heigth;

  Rectangle() {
    width = 1;
    heigth = 1;
  }

  Rectangle(double newWidth, double newHeigth) {
    width = newWidth;
    heigth = newHeigth;
  }

  double getArea() {
    return width * heigth;
  }

  double getPerimeter() {
    return width + width + heigth + heigth;
  }
}
