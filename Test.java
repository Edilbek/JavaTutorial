public class Test {
  public static void main(String[] args) {
    int[] source = {3, 4, 5};
    int[] target = new int[source.length];

    System.arraycopy(source, 0, target, 0, source.length);

    for (int e: target)
      System.out.println(e);
  }
}
