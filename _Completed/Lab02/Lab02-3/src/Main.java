// Vasilii Dementev
// ID 6430613002

public class Main {
  public static void main(String[] args) {

    int r = 0;

    do {
      r = (int) (Math.random() * 100);
      if ((r >= 5) && (r <= 99)) {
        System.out.println("r=" + r);
      }
    }
    while (r != 77);

  }
}