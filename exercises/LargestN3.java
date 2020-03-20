public class LargestN3 {
  public static void main(String[] args) {
    int n = 0;
    System.out.println("Start" + "\n");
    while (Math.pow(n + 1, 3) < 12000) {
      n++;
    }
    System.out.println("Largest n: " + n);
    System.out.println("Result: " + (int) Math.pow(n, 3) + "\n");
    System.out.println("End");
  }
}
