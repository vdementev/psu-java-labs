// Vasilii Dementev
// ID 6430613002

public class Main {
  public static void main(String[] args) {

    int time = 10; // years
    double balance = 10000;
    double interestRate = 0.05;
    double balanceYear = 0;
    double interestYear = 0;

    balanceYear = balance;

    System.out.println("Year" + "\t" + "Interest" + "\t" + "Balance");

    for (int i = 1; i <= time; i++) {
      interestYear = balanceYear * interestRate;
      balanceYear = balanceYear + interestYear;

      System.out.format("%d \t\t %.2f \t %.2f \n", i, interestYear, balanceYear);
    }


  }
}