public class TestRandom {
  public static void main(String[] args) {
    java.util.Random rand = new java.util.Random(1000);

    for (int i = 0; i < 50; i++) {
      System.out.print(rand.nextInt(100) + " ");
    }
  }
}
