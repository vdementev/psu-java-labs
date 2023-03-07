import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number (1-4) :");
    int n = sc.nextInt();

    if (n < 1 || n > 4) {
      throw new InputMismatchException("Input must be between 1 and 4");
    }

    switch (n) {
      case 1:
        System.out.println("1st case");
        break;
      case 2:
        System.out.println("2nd case");
      case 3:
        System.out.println("3rd case");
        throw new RuntimeException("3!");
      case 4:
        System.out.println("4th case");
        throw new Exception("4!");
    }

  }
}