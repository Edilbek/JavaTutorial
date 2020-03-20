public class SmallestN2 {
  public static void main(String[] args) {
    int n = 0;
    System.out.println("Start" + "\n");
    while ( Math.pow(n, 2) < 12000 ) {
      n++;
    }
    System.out.println("Smallest n: " + n);
    System.out.println("Result: " + (int) Math.pow(n, 3) + "\n");
    System.out.println("End");
  }
}
