import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
  private static String[] arr = {"aaa", "bbb", "ccc"};

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the array index: ");

    try {
      int index = s.nextInt();

      if (index <= 0) {
        throw new Exception("Input must be a positive integer");
      }

      if (index > arr.length) {
        throw new Exception("Maximum index value could be: " + (arr.length - 1));
      }

      System.out.println("Array value at index " + index + " is: " + arr[index]);
    }
    catch (InputMismatchException e) {
      throw new RuntimeException(e);
    }
    catch (NumberFormatException e) {
      System.out.println("Input must be a positive integer" + e);
    }
    catch (Exception e) {
      System.out.println("Sorry..." + e);
    }
  }
}
