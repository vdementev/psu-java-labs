// Vasilii Dementev
// ID 6430613002

public class Main {
  public static void main(String[] args) {

    int r = 0;
    int i = 0;

    while (i < 10) {
      r = (int) (Math.random() * 100);
      if ((r >= 1) && (r <= 100) && (r % 10 != 0)) {
        i++;
        System.out.println("r=" + r);
      }
    }
  }
}