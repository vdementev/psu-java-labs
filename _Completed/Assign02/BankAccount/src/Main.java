import java.util.Scanner;

// Vasilii Dementev  ID 6430613002
class Account {
  public long accountID;
  public long customerID;
  public long balance;

  Account() {
    System.out.println("Enter account data");
    Scanner input = new Scanner(System.in);
    System.out.print("accountID: ");
    this.accountID = input.nextLong();
    System.out.print("customerID: ");
    this.customerID = input.nextLong();
    System.out.print("balance: ");
    this.balance = input.nextLong();
    input.close();
  } //default constructor

  Account(long accountID, long customerID, long balance) {
    this.accountID = accountID;
    this.customerID = customerID;
    this.balance = balance;
  }

  public void deposit(long amount) {
    this.balance += amount;
    System.out.println("New balance for account: " + accountID + " is " + balance);
  }

  public void withdraw(long amount) {
    this.balance -= amount;
    System.out.println("New balance for account: " + accountID + " is " + balance);
  }

  public void transferTo(long accountID, long amount) {
    withdraw(amount);
  }

  public void printInfo() {
    System.out.println("accountID: " + accountID);
    System.out.println("customerID: " + customerID);
    System.out.println("balance: " + balance);
    System.out.println();
  }
}

public class Main {
  public static void main(String[] args) {

    Account first = new Account(001, 100, 500);

    first.printInfo();
    first.deposit(231);
    System.out.println();
    first.printInfo();

    Account second = new Account();
    System.out.println();
    second.printInfo();
  }
}