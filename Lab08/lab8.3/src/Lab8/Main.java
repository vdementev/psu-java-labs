package Lab8;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("***Insert Salary Employee Data****");
    System.out.print("Id: ");
    int empId = input.nextInt();
    input.nextLine();
    System.out.print("Name: ");
    String empName = input.nextLine();
    System.out.print("Position: ");
    String position = input.nextLine();
    System.out.print("SSN: ");
    int ssn = input.nextInt();
    System.out.print("Salary: ");
    double salary = input.nextDouble();

    SalaryEmployee salaryEmployee = new SalaryEmployee(empId, empName, position, ssn, salary);
    System.out.println("Salary Slip");
    salaryEmployee.displayEmployeeDetails();
    salaryEmployee.printSalarySlip();
    System.out.println("\n***Insert Hourly Employee Data");
    System.out.print("Id: ");
    empId = input.nextInt();
    input.nextLine();
    System.out.print("Name: ");
    empName = input.nextLine();
    System.out.print("Position: ");
    position = input.nextLine();
    System.out.print("Wage rate: ");
    double wageRate = input.nextDouble();
    System.out.print("Worked hours: ");
    int weekHours = input.nextInt();

    HourlyEmployee hourlyEmployee = new HourlyEmployee(empId, empName, position, wageRate, weekHours);
    System.out.println("****Hourly slip*****");
    hourlyEmployee.printPaymentSlip();
  }
}