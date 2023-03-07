// Vasilii Dementev  ID 6430613002
import java.util.Scanner;

class Student {
  public long studentId;
  public String name;
  public String major;
  Student() {} //default constructor
  Student(long sid, String name, String major) {
    studentId = sid;
    this.name = name;
    this.major = major;
  }
  public void printInfo() {
    System.out.println("StudentId:" + studentId);
    System.out.println("Name:" + name);
    System.out.println("Major:" + major);
    System.out.println();
  }
}

public class Main {
  public static void main(String[] args) {
    Student x = new Student(564444, "Adam Family", "IT");
    x.printInfo();
    Student y = new Student();
    y.printInfo();
    System.out.println("Enter student data");
    Scanner input = new Scanner(System.in);
    System.out.print("id: ");
    int id = input.nextInt();
    System.out.print("name: ");
    String name = input.next();
    System.out.print("major: ");
    String major = input.next();
    input.close();
    Student z = new Student(id, name, major);
    z.printInfo();
  }
}