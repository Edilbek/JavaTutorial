public class TestFan {
  public static void main(String[] args) {
    Fan fan1 = new Fan();
    Fan fan2 = new Fan();
    fan1.setSpeed(Fan.FAST);
    fan1.setRadius(10);
    fan1.setColor("Yellow");
    fan1.setOn(true);

    fan2.setSpeed(Fan.MEDIUM);
    fan2.setRadius(5);
    fan2.setColor("Blue");
    fan2.setOn(false);

    System.out.println("Fan1: " + fan1.ToString());

    System.out.println("Fan2: " + fan2.ToString());
  }
}

class Fan {
  static final int SLOW = 1;
  static final int MEDIUM = 2;
  static final int FAST = 3;
  private int speed = SLOW;
  private boolean on = false;
  private double radius = 5;
  String color = "Blue";

  Fan() {
    speed = 0;
    on = false;
    radius = 0.0;
    color = "";
  }

  public int getSpeed() {
    return this.speed;
  }

  public boolean getOn() {
    return this.on;
  }

  public double getRadius() {
    return this.radius;
  }

  public String getColor() {
    return this.color;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String ToString() {
    String on = this.speed + ": " + this.color + ": " + this.radius;
    String off = "Fan is off" + ": " + this.color + ": " + this.radius;
    return this.on == true ? on : off;
  }
}
