import java.util.Scanner;

class Subject {
  int subjectId;
  String name;
  int credit;

  public Subject(int subjectId, String name, int credit) {
    this.subjectId = subjectId;
    this.name = name;
    this.credit = credit;
  }

  public void printSubject() {
    System.out.println("Subject ID: " + subjectId + ", Name: " + name + ", Credit: " + credit);
  }
}

public class Main {
  static Scanner input = new Scanner(System.in);
  static Subject[] subjects = new Subject[10];
  static int count = 2;

  public static void main(String[] args) {
    subjects[0] = new Subject(10, "Math", 2);
    subjects[1] = new Subject(20, "OOP", 3);

    while (true) {
      System.out.println("Enter:\n1 to add a new subject\n2 to search for a subject by name\n3 to search for a subject by ID\n4 to exit");
      int option = input.nextInt();

      if (option == 1) {
        addSubject();
      }
      else if (option == 2) {
        searchSubjectByName();
      }
      else if (option == 3) {
        searchSubjectById();
      }
      else if (option == 4) {
        break;
      }
    }

    listAllSubjects();
  }

  static void addSubject() {
    System.out.println("Enter the subject ID:");
    int subjectId = input.nextInt();
    System.out.println("Enter the subject name:");
    String name = input.next();
    System.out.println("Enter the subject credit:");
    int credit = input.nextInt();
    subjects[count++] = new Subject(subjectId, name, credit);
  }

  static void searchSubjectByName() {
    System.out.println("Enter the subject name:");
    String searchName = input.next();
    for (Subject subject : subjects) {
      if (subject != null && subject.name.equals(searchName)) {
        subject.printSubject();
      }
    }
  }

  static void searchSubjectById() {
    System.out.println("Enter the subject ID:");
    int searchId = input.nextInt();
    for (int i = 0; i < count; i++) {
      if (subjects[i].subjectId == searchId) {
        System.out.println("Found: " + subjects[i].name);
        System.out.println("Enter:\n1 to edit subject info\n2 to delete the subject\n3 to return to the main menu");
        int subOption = input.nextInt();
        if (subOption == 1) {
          editSubject(i);
        }
        else if (subOption == 2) {
          deleteSubject(i);
        }
        break;
      }
    }
  }

  static void editSubject(int index) {
    System.out.println("Enter the new subject ID:");
    int newSubjectId = input.nextInt();
    System.out.println("Enter the new subject name:");
    String newSubjectName = input.next();
    System.out.println("Enter the new subject credit:");
    int newSubjectCredit = input.nextInt();
    subjects[index] = new Subject(newSubjectId, newSubjectName, newSubjectCredit);
    System.out.println("Subject info updated.");
  }

  static void deleteSubject(int index) {
    for (int i = index; i < count - 1; i++) {
      subjects[i] = subjects[i + 1];
    }
    subjects[count - 1] = null;
    count--;
    System.out.println("Subject deleted.");
  }

  static void listAllSubjects() {
    System.out.println("All subjects:");
    for (Subject subject : subjects) {
      if (subject != null) {
        subject.printSubject();
      }
    }
  }

}
