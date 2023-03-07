public class StructuralClass {

  static int globalVariable = 10;
  int nonStaticVariable = 5;

  public static void initMethod() {
    System.out.println("method: initialMethod");
    System.out.println("global_var = " + globalVariable);

  }

  public static void increaseMethod() {
    int localVariable = 10;
    globalVariable += 10;

    System.out.println("Method: increaseMethod");
    System.out.println("global_var = " + globalVariable);
    System.out.println("local_var = " + localVariable);
    System.out.println();

  }

  public static void main(String[] args) {
    System.out.println("Structural Programming Style");
    System.out.println("globalVariable = " + globalVariable);
//    System.out.println("localVariable = " + localVariable);
//    System.out.println("nonStaticVariable = " + nonStaticVariable);

    initMethod();
    System.out.println("---------------");
    increaseMethod();
    System.out.println("---------------");
    increaseMethod();
    System.out.println("---------------");

  }
}