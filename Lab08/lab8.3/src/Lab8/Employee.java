package Lab8;

public class Employee {
  private int empId;
  private String empName;
  private String position;

  public Employee(int empId, String empName, String position) {
    this.empId = empId;
    this.empName = empName;
    this.position = position;
  }

  public int getEmpId() {
    return empId;
  }

  public String getEmpName() {
    return empName;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }
}

class SalaryEmployee extends Employee {
  private int ssn;
  private double salary;

  public SalaryEmployee(int empId, String empName, String position, int ssn, double salary) {
    super(empId, empName, position);
    this.ssn = ssn;
    this.salary = salary;
  }

  public void displayEmployeeDetails() {
    System.out.println(getEmpId() + " " + getEmpName() + " " + getPosition());
    System.out.println("SSN: " + ssn + " Salary: " + salary);
  }

  public void printSalarySlip() {
    double socialTax;
    if (salary <= 1000) {
      socialTax = 20.0;
    }
    else {
      socialTax = 0.05 * salary;
    }
    double netSalary = salary - socialTax;
    System.out.println("Social Tax = " + socialTax);
    System.out.println("Net salary = " + netSalary);
  }
}

class HourlyEmployee extends Employee {
  private double wageRate;
  private int weekHours;

  public HourlyEmployee(int empId, String empName, String position, double wageRate, int weekHours) {
    super(empId, empName, position);
    this.wageRate = wageRate;
    this.weekHours = weekHours;
  }

  public double calculateEarningsPerWeek() {
    double earnings;
    if (weekHours <= 40) {
      earnings = wageRate * weekHours;
    }
    else {
      earnings = wageRate * 40 + 1.5 * wageRate * (weekHours - 40);
    }
    return earnings;
  }

  public void printPaymentSlip() {
    System.out.println(getEmpId() + " " + getEmpName() + " " + getPosition());
    System.out.println("Worked hours = " + weekHours + " Wage rate = " + wageRate);
    System.out.println("Earnings = " + calculateEarningsPerWeek());
  }
}