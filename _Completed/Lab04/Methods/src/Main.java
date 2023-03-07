// Vasilii Dementev - id 6430613002

import java.util.Scanner;

class Shape {
  String type;
  String color;
  private String name;

  public Shape(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double calculateArea(int radius) {
    return 3.14 * radius * radius;
  }

  public int calculateArea(int width, int length) {
    return width * length;
  }

  public void calculateArea(int side1, int side2, int side3) {
    double s = (side1 + side2 + side3) / 2;
    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    System.out.println("Area = " + area);

  }
}

public class Main {
  public static void main(String[] args) {

    System.out.println("*** Program: Area calculation ***");
    System.out.println("Select menu");
    System.out.println("1 : Circle");
    System.out.println("2 : Rectangle");
    System.out.println("3 : Triangle");
    System.out.println("4 : Exit");
    System.out.println("Select menu: ");
    Scanner input = new Scanner(System.in);
    int menu = input.nextInt();
    input.nextLine(); // nextInt() does not consume the '\n'. Need to do it manually.

    while (menu != 4) {
      if (menu == 1) {
        System.out.println("Create circle object...");
        Shape circleObj = new Shape("circle");
        System.out.println("Enter name of shape: ");
        circleObj.setName(input.nextLine());
        System.out.println("Enter color: ");
        circleObj.color = input.nextLine();
        System.out.println("Enter radius: ");
        int radius = input.nextInt();
        input.nextLine(); // nextInt() does not consume the '\n'. Need to do it manually.
        System.out.println("Circle name: " + circleObj.getName() + " color = " + circleObj.color);
        System.out.println("Area = " + circleObj.calculateArea(radius));
      }
      if (menu == 2) {
        System.out.println("Create rectangle object...");
        Shape rectangleObj = new Shape("rectangle");
        System.out.println("Enter name of rectangle: ");
        rectangleObj.setName(input.nextLine());
        System.out.println("Enter color: ");
        rectangleObj.color = input.nextLine();
        System.out.println("Enter width: ");
        int width = input.nextInt();
        System.out.println("Enter length: ");
        int length = input.nextInt();
        input.nextLine(); // nextInt() does not consume the '\n'. Need to do it manually.
        System.out.println("Rectangle name: " + rectangleObj.getName() + " color = " + rectangleObj.color);
        System.out.println("Area = " + rectangleObj.calculateArea(width, length));
      }
      if (menu == 3) {
        System.out.println("Create triangle object...");
        Shape triangleObj = new Shape("triangle");
        System.out.println("Enter name of triangle: ");
        triangleObj.setName(input.nextLine());
        System.out.println("Enter color: ");
        triangleObj.color = input.nextLine();
        System.out.println("Enter side1: ");
        int side1 = input.nextInt();
        System.out.println("Enter side2: ");
        int side2 = input.nextInt();
        System.out.println("Enter side3: ");
        int side3 = input.nextInt();
        input.nextLine(); // nextInt() does not consume the '\n'. Need to do it manually.
        System.out.println("Rectangle name: " + triangleObj.getName() + " color = " + triangleObj.color);
        triangleObj.calculateArea(side1, side2, side3);
      }
      System.out.println("");
      System.out.println("*** Program: Area calculation ***");
      System.out.println("Select menu");
      System.out.println("1 : Circle");
      System.out.println("2 : Rectangle");
      System.out.println("3 : Triangle");
      System.out.println("4 : Exit");
      System.out.println("Select menu: ");
      menu = input.nextInt();
      input.nextLine(); // nextInt() does not consume the '\n'. Need to do it manually.
    }
    input.close();
    System.out.println("Exit");
  }
}