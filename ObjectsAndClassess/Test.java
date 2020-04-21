// public class Test {
//   public static void main(String[] args) {
//     Count myCount = new Count();
//     int times = 0;
//
//     for (int i = 0; i < 100; i++)
//       increment(myCount, times);
//
//     System.out.println("count is " + myCount.count);
//     System.out.println("times is " + times);
//   }
//
//   public static void increment(Count c, int times) {
//     c.count++;
//     times++;
//   }
// }

// public class Test {
//   public static void main(String[] args) {
//     Circle circle1 = new Circle(1);
//     Circle circle2 = new Circle(2);
//
//     swap1(circle1, circle2);
//     System.out.println("After swap1: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
//
//     swap2(circle1, circle2);
//     System.out.println("After swap2: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
//   }
//
//   public static void swap1(Circle x, Circle y) {
//     Circle temp = x;
//     x = y;
//     y = temp;
//   }
//
//   public static void swap2(Circle x, Circle y) {
//     double temp = x.radius;
//     x.radius = y.radius;
//     y.radius = temp;
//   }
// }


// public class Test {
//   public static void main(String[] args) {
//     int[] a = {1, 2};
//     swap(a[0], a[1]);
//     System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
//   }
//
//   public static void swap(int n1, int n2) {
//     int temp = n1;
//     n1 = n2;
//     n2 = temp;
//   }
// }

// public class Test {
//   public static void main(String[] args) {
//     int[] a = {1, 2};
//     swap(a);
//     System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
//   }
//
//   public static void swap(int[] a) {
//     int temp = a[0];
//     a[0] = a[1];
//     a[1] = temp;
//   }
// }


// public class Test {
//   public static void main(String[] args) {
//     java.util.Date[] dates = new java.util.Date[10];
//     System.out.println(dates[0]);
//     System.out.println(dates[0].toString());
//   }
// }

public class Test {
  private static int i = 0;
  private static int j = 0;
  public static void main(String[] args) {
    int i = 2;
    int k = 3;
    {
      int j = 3;
      System.out.println("i + j is " + i + j);
    }
    k = i + j;
    System.out.println("k is " + k);
    System.out.println("j is " + j);
  }
}
