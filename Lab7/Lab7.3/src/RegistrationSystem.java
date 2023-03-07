import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationSystem {

  private static ArrayList<Student> students = new ArrayList<>();
  private static ArrayList<Subject> subjects = new ArrayList<>();

  public static void main(String[] args) {
    initializeData();
    showMenu();
  }

  private static void initializeData() {
    students.add(new Student("1", "Mark", 3.0));
    students.add(new Student("2", "Tom", 2.1));
    students.add(new Student("3", "Lily", 3.1));

    subjects.add(new Subject("977-210", "OOP", 3));
    subjects.add(new Subject("977-200", "Calculus", 3));
    subjects.add(new Subject("977-216", "Computer Architecture", 3));
    subjects.add(new Subject("969-092", "E-Sport", 1));
    subjects.add(new Subject("980-096", "Scuba Diving", 1));
    subjects.add(new Subject("969-061", "Systematic Solving", 2));
    subjects.add(new Subject("988-061", "Logical Thinking", 2));
  }

  private static void showMenu() {
    Scanner input = new Scanner(System.in);
    int option;
    do {
      System.out.println("**** REGISTRATION SYSTEM ****");
      System.out.println("1 : Show student list");
      System.out.println("2 : Add new student");
      System.out.println("3 : Edit/delete student");
      System.out.println("4 : Search student by name");
      System.out.println("5 : Show subject list");
      System.out.println("6 : Register");
      System.out.println("9 : Exit");
      System.out.println("******************************");
      System.out.print("Select menu: ");
      option = input.nextInt();
      switch (option) {
        case 1 -> showStudentList();
        case 2 -> addNewStudent();
        case 3 -> editOrDeleteStudent();
        case 4 -> searchStudentByName();
        case 5 -> showSubjectList();
        case 6 -> register();
        case 9 -> System.out.println("Bye...");
        default -> System.out.println("Invalid choice!");
      }
      System.out.println();
    }
    while (option != 9);
    input.close();
  }

  private static void showStudentList() {
    System.out.println("Student List...");
    for (int i = 0; i < students.size(); i++) {
      System.out.println((i + 1) + ". " + students.get(i));
    }
  }

  private static void addNewStudent() {
    int prevAmount = students.size();
    Scanner input = new Scanner(System.in);
    char choice;
    do {
      System.out.println("*** Add new student ***");
      System.out.print("Enter ID: ");
      String id = input.nextLine();
      System.out.print("Enter Name: ");
      String name = input.nextLine();
      System.out.print("Enter GPA: ");
      double gpa = input.nextDouble();
      input.nextLine(); // Consume the newline character
      students.add(new Student(id, name, gpa));
      System.out.print("Add more? [y|n]: ");
      choice = input.nextLine().charAt(0);
    }
    while (choice == 'y' || choice == 'Y');
    int addedAmount = students.size() - prevAmount;
    System.out.println("Added " + addedAmount + " record(s) successfully.");
  }

  private static void editOrDeleteStudent() {
    Scanner input = new Scanner(System.in);
    System.out.println("Edit/delete student..");
    System.out.print("Search student by ID: ");
    String id = input.nextLine();
    Student student = findStudentById(id);
    if (student != null) {
      System.out.println(student);
      System.out.print("Do you want to delete student or edit GPA? [d|e]: ");
      char choice = input.nextLine().charAt(0);
      switch (choice) {
        case 'd', 'D' -> {
          students.remove(student);
          System.out.println("Deleted successfully.");
        }
        case 'e', 'E' -> {
          System.out.print("Enter new GPA: ");
          double gpa = input.nextDouble();
          input.nextLine(); // Consume the newline character
          student.setGpa(gpa);
          System.out.println("Update successfully.");
        }
        default -> System.out.println("Invalid choice!");
      }
    }
    else {
      System.out.println("Student not found!");
    }
  }

  private static void searchStudentByName() {
    Scanner input = new Scanner(System.in);
    System.out.print("Search student by name: ");
    String name = input.nextLine();
    for (Student student : students) {
      if (student.getName().toLowerCase().contains(name.toLowerCase())) {
        System.out.println(student);
      }
    }
  }

  private static void showSubjectList() {
    System.out.println("Subject List...");
    for (Subject subject : subjects) {
      System.out.println("Subject: " + subject);
    }
  }

  private static void register() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter student ID: ");
    String id = input.nextLine();
    Student student = findStudentById(id);
    if (student != null) {
      System.out.println(student);
      ArrayList<Subject> enrolledSubjects = new ArrayList<>();
      char choice;
      do {
        System.out.println("\n**Select subjects for registration**");
        System.out.print("Enter subject ID: ");
        String subjectId = input.nextLine();
        Subject subject = findSubjectById(subjectId);
        if (subject != null) {
          System.out.println("Subject: " + subject);
          System.out.print("Do you want to enroll this subject? [y|n]: ");
          choice = input.nextLine().charAt(0);
          if (choice == 'y' || choice == 'Y') {
            enrolledSubjects.add(subject);
          }
        }
        else {
          System.out.println("Subject not found!");
        }
        System.out.print("Add more subject? [y|n]: ");
        choice = input.nextLine().charAt(0);
      }
      while (choice == 'y' || choice == 'Y');
      System.out.println("\n****REGISTRATION RESULT OF SEMESTER 2/2022***");
      System.out.println("Student ID: " + student.getId() + " Name: " + student.getName());
      System.out.println("-------------------------------------");
      for (Subject subject : enrolledSubjects) {
        System.out.println("Subject: " + subject);
      }
      System.out.println("-------------------------------------");
      int totalCredits = enrolledSubjects.stream().mapToInt(Subject::getCredits).sum();
      System.out.println("Total credits = " + totalCredits);
      System.out.println("-------------------------------------");
    }
    else {
      System.out.println("Student not found!");
    }
  }

  private static Student findStudentById(String id) {
    for (Student student : students) {
      if (student.getId().equals(id)) {
        return student;
      }
    }
    return null;
  }

  private static Subject findSubjectById(String id) {
    for (Subject subject : subjects) {
      if (subject.getId().equals(id)) {
        return subject;
      }
    }
    return null;
  }

  private static class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
      this.id = id;
      this.name = name;
      this.gpa = gpa;
    }

    public String getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public void setGpa(double gpa) {
      this.gpa = gpa;
    }

    public String toString() {
      return "Student ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
  }

  private static class Subject {
    private String id;
    private String name;
    private int credits;

    public Subject(String id, String name, int credits) {
      this.id = id;
      this.name = name;
      this.credits = credits;
    }

    public String getId() {
      return id;
    }

    public int getCredits() {
      return credits;
    }

    public String toString() {
      return id + " " + name + " (" + credits + " credit(s))";
    }
  }
}