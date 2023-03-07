import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a:");
      int a = sc.nextInt();
      System.out.println(a);
      System.out.print("Enter b:");
      int b = sc.nextInt();
      System.out.println(b);
      System.out.println("a/b = " + (a / b));
      System.out.println("a*b = " + (a * b));
    }
    catch (ArithmeticException e) {
      System.out.println("Cannot calculate a/b because b = 0");
    }
    catch (InputMismatchException e) {
      System.out.println("Error: Input must be integer number.");
    }
    finally {
      System.out.println("Do something in finally block");
    }
    System.out.println("**End of program**");
  }
}