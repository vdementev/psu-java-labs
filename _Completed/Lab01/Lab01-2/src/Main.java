// Vasilii Dementev
// ID 6430613002

import java.util.Scanner;

public class Main {
  static final double pi = 3.1416;

  public static void main(String[] args) {
    System.out.print("Enter ID: ");
    Scanner idSc = new Scanner(System.in);
    int id = idSc.nextInt();

    System.out.print("Enter name: ");
    Scanner nameSc = new Scanner(System.in);
    String name = nameSc.nextLine();

    System.out.print("Enter year of study: ");
    Scanner yearSc = new Scanner(System.in);
    int year = yearSc.nextInt();

    System.out.print("Enter height(m): ");
    Scanner heightSc = new Scanner(System.in);
    double height = heightSc.nextDouble();


    System.out.println("*** Student Data ***");
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Year:" + year);
    System.out.println("Height: " + height);
  }
}