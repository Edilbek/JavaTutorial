import java.util.Scanner;

public class AssignGrades {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of students: ");
    int count = input.nextInt();
    int[] scores = new int[count];

    fillArray(scores, input);
    showResult(scores, getBestScore(scores));
  }

  public static void fillArray(int[] scores, Scanner input) {
    System.out.println("Fill an array: ");
    for (int i = 0; i < scores.length; i++) {
      scores[i] = input.nextInt();
    }
  }

  public static int getBestScore(int[] scores) {
    int bestScore = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > bestScore) {
        bestScore = scores[i];
      }
    }
    return bestScore;
  }

  public static String assignGrade(int score, int bestScore) {
    String grade = "";
    if (score >= bestScore - 10)
      grade = "A";
    else if (score >= bestScore - 20)
      grade = "B";
    else if (score >= bestScore - 30)
      grade = "C";
    else if (score >= bestScore - 40)
      grade = "D";
    else
      grade = "F";

    return grade;
  }

  public static void showResult(int[] scores, int bestScore) {
    int e = 1;

    for (int i = 0; i < scores.length; i++) {
      System.out.println("Student " + e + " score is " + scores[i] + " and grade is " + assignGrade(scores[i], bestScore));
      e++;
    }
  }
}
