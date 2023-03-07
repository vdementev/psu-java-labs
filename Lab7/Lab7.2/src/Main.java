import java.util.ArrayList;
import java.util.Scanner;

class Student {
  private int id;
  private String name;
  private double gpa;

  public Student(int id, String name, double gpa) {
    this.id = id;
    this.name = name;
    this.gpa = gpa;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public String toString() {
    return "ID: " + id + "\nName: " + name + "\nGPA: " + gpa;
  }
}

public class Main {
  static Scanner input = new Scanner(System.in);
  static ArrayList<Student> students = new ArrayList<>();

  public static void main(String[] args) {
    students.add(new Student(1, "Rick", 2.2));
    students.add(new Student(2, "Morty", 3.3));

    while (true) {
      System.out.println("\nEnter\n1 to insert a new student\n2 to update a student\n3 to delete a student\n4 to show report\n5 to exit");
      int option = input.nextInt();
      switch (option) {
        case 1:
          addStudent();
          break;
        case 2:
          updateStudent();
          break;
        case 3:
          deleteStudent();
          break;
        case 4:
          showReport();
          break;
        case 5:
          return;
        default:
          System.out.println("Invalid option. Please try again.");
          break;
      }
    }
  }

  static void addStudent() {
    System.out.println("\nEnter the student ID:");
    int id = input.nextInt();
    input.nextLine(); // clear the scanner buffer
    System.out.println("Enter the student name:");
    String name = input.nextLine();
    System.out.println("Enter the student GPA:");
    double gpa = input.nextDouble();
    students.add(new Student(id, name, gpa));
    System.out.println("Student added.");
  }

  static void updateStudent() {
    System.out.println("\nEnter the student ID or name:");
    String search = input.next().toLowerCase();
    boolean found = false;
    for (Student student : students) {
      if (String.valueOf(student.getId()).equalsIgnoreCase(search) || student.getName().toLowerCase().equals(search)) {
        found = true;
        handleStudent(student);
        break;
      }
    }
    if (!found) {
      System.out.println("Student not found.");
    }
  }

  static void deleteStudent() {
    System.out.println("\nEnter the student ID or name:");
    String search = input.next().toLowerCase();
    boolean found = false;
    for (int i = 0; i < students.size(); i++) {
      Student student = students.get(i);
      if (String.valueOf(student.getId()).equalsIgnoreCase(search) || student.getName().toLowerCase().equals(search)) {
        students.remove(i);
        System.out.println("Student deleted.");
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Student not found.");
    }
  }

  static void showReport() {
    System.out.println("\nList of students:");
    for (int i = 0; i < students.size(); i++) {
      System.out.println((i + 1) + ". " + students.get(i).toString() + "\n");
    }
    System.out.println("Number of students: " + students.size());
    double totalGpa = 0;
    for (Student student : students) {
      totalGpa += student.getGpa();
    }
    double avgGpa = totalGpa / students.size();
    System.out.printf("Average GPA: %.2f\n", avgGpa);
  }

  static void handleStudent(Student student) {
    System.out.println("\n" + student.toString() + "\nEnter\n1 to print student info\n2 to edit student GPA\n3 to delete student\n4 to exit");
    int subOption = input.nextInt();
    if (subOption == 1) {
      System.out.println(student.toString());
    }
    else if (subOption == 2) {
      System.out.println("Enter the new GPA:");
      double newGpa = input.nextDouble();
      student.setGpa(newGpa);
      System.out.println("Student GPA updated.");
    }
    else if (subOption == 3) {
      students.remove(student);
      System.out.println("Student deleted.");
    }
    else if (subOption == 4) {
      return;
    }
    else {
      System.out.println("Invalid option.");
    }
  }
}