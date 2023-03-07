import java.util.Scanner;

public class Main {
  private static final int ROWS = 4;
  private static final int[] PRIZES = {1000, 500, 200, 50};
  private static final int ROW_LENGTHS[] = {1, 3, 5, 10};
  private static final int MAX_NUMBER = 100;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = 0;
    while (number != 999) {
      int[][] lotto = new int[ROWS][];
      for (int i = 0; i < ROWS; i++) {
        lotto[i] = new int[ROW_LENGTHS[i]];
        for (int j = 0; j < ROW_LENGTHS[i]; j++) {
          lotto[i][j] = (int) (Math.random() * MAX_NUMBER) + 1;
        }
      }
      System.out.print("Enter a number for lottery game: ");
      number = input.nextInt();
      boolean found = false;
      int prize = 0;
      for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < ROW_LENGTHS[i]; j++) {
          if (lotto[i][j] == number) {
            found = true;
            prize = PRIZES[i];
            System.out.printf("Congratulations: you got %d%s prize: %d$\n", i + 1, i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th", prize);
            System.out.printf("Found at lotto[%d][%d]\n", i, j);
            break;
          }
        }
        if (found) {
          number = 999;
          break;
        }
      }
      if (!found) {
        System.out.println("You are not lucky today");
      }
      System.out.println("1st prize: " + lotto[0][0]);
      System.out.print("2nd prize: ");
      for (int j = 0; j < ROW_LENGTHS[1]; j++) {
        System.out.print(lotto[1][j] + " ");
      }
      System.out.println();
      System.out.print("3rd prize: ");
      for (int j = 0; j < ROW_LENGTHS[2]; j++) {
        System.out.print(lotto[2][j] + " ");
      }
      System.out.println();
      System.out.print("4th prize: ");
      for (int j = 0; j < ROW_LENGTHS[3]; j++) {
        System.out.print(lotto[3][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Bye.");
    input.close();
  }
}
