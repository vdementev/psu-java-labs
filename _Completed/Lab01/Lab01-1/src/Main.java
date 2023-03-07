// Vasilii Dementev
// ID 6430613002

import java.util.Scanner;

public class Main {
  static final double pi = 3.1416;

  static void calcArea(double rad) {
    double area = pi * rad * rad;
    System.out.println("Circle area is: " + area);
  }

  static void calcVolume(double rad) {
    double volume = (4 * pi * rad * rad * rad) / 3;
    System.out.println("Sphere volume is: " + volume);
  }

  public static void main(String[] args) {
    System.out.println("Please enter radius value: ");
    Scanner sc = new Scanner(System.in);
    double rad = sc.nextDouble();
    calcArea(rad);
    calcVolume(rad);
  }
}