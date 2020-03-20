public class DivisibleByFiveAndSix {
  public static void main(String[] args) {
    for (int i = 100; i <= 1000; i++) {
      for (int j = 0; j < 10 && i <= 1000; i++) {
        // divisible by 5 or 6, not both
        // if (i % 5 == 0 || i % 6 == 0) {

        // divisible by 5 and 6
        if (i % 5 == 0 && i % 6 == 0) {
          System.out.print(i + "  ");
          j++;
        }
      }
      System.out.println();
    }
  }
}
