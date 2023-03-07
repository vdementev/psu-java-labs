// Vasilii Dementev ID 6430613002
import java.util.Scanner;
public class Main {
  public static String checkBmi(double bmi) {
    if (bmi < 0) {
      return "Error!";
    }
    else if (bmi < 18.5) {
      return "Underweight";
    }
    else if (bmi < 24.9) {
      return "Healthy";
    }
    else if (bmi < 29.9) {
      return "Overweight";
    }
    else {
      return "Obese";
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your Name: ");
    String name = input.next();
    System.out.print("Enter gender [M|F]: ");
    String gender = input.next();
    System.out.print("Enter birth place: ");
    String birthplace = input.next();
    System.out.println("***** BMI Calculator *****");
    System.out.print("Enter Weight(kg): ");
    double weight = input.nextDouble();
    System.out.print("Enter Height(cm): ");
    double height = input.nextDouble();
    input.close();
    double bmi = weight / Math.pow(height / 100, 2);
    System.out.println("Body Mass Index = " + bmi);
    System.out.println("Health status is: " + checkBmi(bmi));
  }
}