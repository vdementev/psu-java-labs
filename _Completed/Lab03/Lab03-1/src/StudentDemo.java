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

//********************************
public class StudentDemo {
  public static void main(String[] args) {
    Student x = new Student(564444, "Adam Family", "IT");
    x.printInfo();

    Student y = new Student();
    y.printInfo();
  }
}