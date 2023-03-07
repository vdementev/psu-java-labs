public class ObjectClass {

  static int globalVariable = 10;
  int nonStaticVariable = 5;

  public static void main(String[] args) {

    System.out.println("Object-Oriented Programming Style");

    ObjectClass obj = new ObjectClass();
    System.out.println("globalVariable = " + globalVariable);
    System.out.println("obj.globalVariable = " + obj.globalVariable);
    //  System.out.println("localVariable = "+ localVariable);
    //  System.out.println("nonStaticVariable = "+ nonStaticVariable);
    System.out.println("obj.nonStaticVariable = " + obj.nonStaticVariable);

    obj.initMethod();
    System.out.println("---------------");
    obj.increaseMethod();
    System.out.println("---------------");
    obj.increaseMethod();
    System.out.println("---------------");

    ObjectClass obj2 = new ObjectClass();
    System.out.println("obj2.globalVariable = " + obj2.globalVariable);
    System.out.println("obj2.nonStaticVariable = " + obj2.nonStaticVariable);

    obj2.initMethod();
    System.out.println("---------------");
    obj2.increaseMethod();
    System.out.println("---------------");
  }

  public void initMethod() {
    System.out.println("method: initialMethod");
    System.out.println("global_var = " + globalVariable);

  }

  public void increaseMethod() {
    int localVariable = 10;
    globalVariable += 10;

    System.out.println("Method: increaseMethod");
    System.out.println("global_var = " + globalVariable);
    System.out.println("local_var = " + localVariable);
    System.out.println();

  }
}