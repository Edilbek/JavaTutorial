import java.util.Scanner;

public class HighestScore {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    print("Enter number of students: ");
    int count = input.nextInt();
    int highestScore, preHighScore = 0;
    String highestScoreName, preHighScoreName = "";

    for (Integer i = 0; i < count; i++) {
      print("Student " + (i + 1) + " name: ");
      String name = input.next();

      print("Student " + (i + 1) + " score: ");
      int score = input.nextInt();
      print("------");

      if ( score > highestScore ) {
        highestScore = score;
        highestScoreName = name;
      }
    }

    print("Student with max score is: " + highestScoreName);
  }

  public static void print(Object text) {
    System.out.println(text);
  }
}
