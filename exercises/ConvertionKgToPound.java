public class ConvertionKgToPound {
  public static void main(String[] args) {
    System.out.println("Kilo     Pounds");
    double pound = 2.2;
    int i = 1;
    while (i < 200) {
      pound = i * 2.2;
      i++;
      System.out.printf(i + ":       %1.1f \n", pound);
    }
  }
}
