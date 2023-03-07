public class MyProgram {
  public static void main(String[] args) {

    System.out.println("Object-Oriented Programming Style");

    ObjectClass obj  = new ObjectClass();
    // System.out.println("globalVariable = "+ globalVariable);
    System.out.println("globalVariable = "+ obj.globalVariable);

    //  System.out.println("localVariable = "+ localVariable);
    //  System.out.println("nonStaticVariable = "+ nonStaticVariable);
    System.out.println("nonStaticVariable = "+ obj.nonStaticVariable);

    obj.initMethod();
    System.out.println("---------------");
    obj.increaseMethod();
    System.out.println("---------------");
    obj.increaseMethod();
    System.out.println("---------------");

  }
}