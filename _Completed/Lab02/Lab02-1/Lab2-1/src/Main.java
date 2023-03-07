// Vasilii Dementev
// ID 6430613002
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.print("Enter name: ");
    Scanner nameSc = new Scanner(System.in);
    String name = nameSc.nextLine();
    System.out.print("Enter score: ");
    Scanner scoreSc = new Scanner(System.in);
    int score = scoreSc.nextInt();
    char grade = 'N';

    if (score > 100) {
      System.out.print("Invalid score!");
      System.exit(0);
    }
    else if (score >= 85) {
      grade = 'A';
    }
    else if (score >= 75) {
      grade = 'B';
    }
    else if (score >= 65) {
      grade = 'C';
    }
    else if (score >= 55) {
      grade = 'D';
    }
    else if (score >= 0) {
      grade = 'F';
    }
    else {
      System.out.print("Invalid score!");
      System.exit(0);
    }

    System.out.println("Grade = " + grade);
  }
}