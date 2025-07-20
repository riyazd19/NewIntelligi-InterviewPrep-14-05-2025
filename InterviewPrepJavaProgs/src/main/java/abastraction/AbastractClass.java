package abastraction;

abstract class AbastractClass {

  public void fun1(){
      System.out.println("from abstraction class fun1");
  }
  public void fun2(){
      System.out.println("from abstraction class fun2 ");
  }
  abstract void fun3();

}

class ToInherite extends AbastractClass{

    public static void main(String[] args) {
      //  ToInherite tI= new AbastractClass();
        AbastractClass AC= new ToInherite();
        AC.fun1();
        AC.fun3();
    }


    @Override
    void fun3() {

    }
}
