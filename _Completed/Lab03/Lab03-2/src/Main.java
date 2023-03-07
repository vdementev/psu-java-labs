import java.util.Scanner;

class Cube {
  public int edge;
  Cube() {}
  Cube(int edge) {
    this.edge = edge;
  }
  public int calculateArea() {
    int area = 6 * edge * edge;
    return area;
  }
  public int calculateVolume() {
    int vol = edge * edge * edge;
    return vol;
  }
}

class Cylinder {
  public int radius;
  public int height;
  Cylinder() {}
  Cylinder(int radius, int height) {
    this.radius = radius;
    this.height = height;
  }
  public double calculateArea() {
    double area = 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;
    return area;
  }
  public double calculateVolume() {
    double vol = 3.14 * radius * radius * height;
    return vol;
  }
}

public class Main {
  public static void main(String[] args) {
    Cube cube1 = new Cube(5);
    System.out.println("Area: " + cube1.calculateArea());
    System.out.println("Volume: " + cube1.calculateVolume());
    Scanner input = new Scanner(System.in);
    System.out.print("Enter cylinder radius: ");
    int cr = input.nextInt();
    System.out.print("Enter cylinder height: ");
    int ch = input.nextInt();
    input.close();
    Cylinder cyl1 = new Cylinder(cr, ch);
    System.out.println("Area: " + cyl1.calculateArea());
    System.out.println("Volume: " + cyl1.calculateVolume());
  }
}