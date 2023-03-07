// Vasilii Dementev ID 6430613002

import java.util.Scanner;

public class Main {
  public static Double convFtoC(double tempF) {
    return (tempF - 32.0) * (5.0 / 9.0);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("Enter degree (Fahrenheit): ");
      double tempF = input.nextDouble();
      if (tempF == 999) {
        break;
      }
      System.out.println(tempF + " Fahrenheit = " + convFtoC(tempF) + " Celsius");
    }
    input.close();
    System.out.print("Bye\n");
  }
}