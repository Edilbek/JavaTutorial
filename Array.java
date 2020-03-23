public class Array {
  public static void main(String[] args) {
    int[] myList = { 1, 2, 3, 34, 5 };

    int temp = myList[0];
    for (int i = 1; i < myList.length; i++) {
      myList[i - 1] = myList[i];
    }
    myList[myList.length - 1] = temp;

    for (int e: myList) {
      System.out.println(e);
    }
  }
}
