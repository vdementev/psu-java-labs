import java.util.Scanner;

class Employee {
  public int id;
  public String name;
  public String position;
  public double salary;
  public double taxRate;

  Employee() {}

  Employee(int id, String name, String position, double salary, double taxRate) {
    this.id = id;
    this.name = name;
    this.position = position;
    this.salary = salary;
    this.taxRate = taxRate;
  }

  public void getEmployeeDetail() {
    System.out.println("==============================");
    System.out.println("ID \t NAME \t Position");
    System.out.println(id + " \t " + name + " \t " + position);
    System.out.println("==============================");
  }

  public void calculateTax() {
    double tax = salary * taxRate / 100;
    double salaryNet = salary - tax;
    System.out.println("Salary: " + salary);
    System.out.println("Tax " + taxRate + "%:" + tax);
    System.out.println("Net salary: " + salaryNet);
    System.out.println("==============================");
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("**** Payroll System ****");
    System.out.println("Enter employee detail");
    Scanner input = new Scanner(System.in);
    System.out.print("id: ");
    int id = input.nextInt();
    input.nextLine(); // nextInt() does not consume the '\n'. Need to do it manually.
    System.out.print("name: ");
    String name = input.nextLine();
    System.out.print("position: ");
    String position = input.nextLine();
    System.out.print("salary: ");
    double salary = input.nextDouble();
    System.out.print("Enter tax rate(%): ");
    double tax = input.nextDouble();
    input.close();
    Employee emp1 = new Employee(id, name, position, salary, tax);
    emp1.getEmployeeDetail();
    emp1.calculateTax();
  }
}