import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {4, 3, 8, 10, 22, 40, 12, 55, 60, 88, 7};
    System.out.println("Searching data in an array....");
    System.out.print("Enter index of the element:");
    try {
      int index = sc.nextInt();
    }
    catch (InputMismatchException e) {
      throw new RuntimeException(e);
//      System.out.println("Error: Input must be integer number.");
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}