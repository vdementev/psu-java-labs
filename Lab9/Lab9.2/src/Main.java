interface Vat {
  double vatRate = 0.06;

  double calculateVat();
}

abstract class Goods {
  private String description;
  private double price;

  public Goods(String description, double price) {
    this.description = description;
    this.price = price;
  }

  public void printGoods() {
    System.out.print("\nGoods: " + description + " Price: " + price + " ");
  }

  public abstract void display();

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }
}

class Food extends Goods {
  private int calories;

  public Food(String description, double price, int calories) {
    super(description, price);
    this.calories = calories;
  }

  public void display() {
    printGoods();
    System.out.println("Calories: " + calories + " cal/100g");
  }

}

class Toy extends Goods implements Vat {
  private int minimumAge;

  public Toy(String description, double price, int minimumAge) {
    super(description, price);
    this.minimumAge = minimumAge;
  }

  public void display() {
    printGoods();
    System.out.println("Minimum age: " + minimumAge);
    double vat = calculateVat();
    System.out.println("VAT " + (vatRate * 100) + "% = $" + vat);
    System.out.println("Price incl.VAT = $" + (getPrice() + vat));
  }

  public double calculateVat() {
    return getPrice() * vatRate;
  }

}

class Book extends Goods implements Vat {
  private String author;

  public Book(String description, double price, String author) {
    super(description, price);
    this.author = author;
  }

  public void display() {
    printGoods();
    System.out.println("Author: " + author);
    double vat = calculateVat();
    System.out.println("VAT " + (vatRate * 100) + "% = $" + vat);
    System.out.println("Price incl.VAT = $" + (getPrice() + vat));
  }

  public double calculateVat() {
    return getPrice() * vatRate;
  }

}

public class Main {
  public static void main(String[] args) {
    Food avocado = new Food("Avocado", 2.0, 160);
    avocado.display();

    Toy barbie = new Toy("Barbie doll", 20.0, 3);
    barbie.display();

    Food apple = new Food("Apple", 1.0, 50);
    apple.display();

    Book hp2 = new Book("Harry Potter 2", 10.0, "JK Rowling");
    hp2.display();
  }
}
