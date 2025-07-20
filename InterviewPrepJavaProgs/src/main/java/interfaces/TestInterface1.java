package interfaces;

interface TestInterface {
    public void fun1(double amount);
    default void fun2() {
        System.out.println("from interface static");
    }
    static void fun3() {
        System.out.println("from static 3");
    }
}
interface TestInterface1 {
    public void fun1(double amount);
    default void fun2() {
        System.out.println("from interface static TestInterface1");
    }
    static void fun3() {
        System.out.println("from static 3");
    }
}

class ToImpleamt implements TestInterface1, TestInterface {


    public static void main(String[] args) {


    }

    @Override
    public void fun1(double amount) {

    }

    @Override
    public void fun2() {
        TestInterface1.super.fun2();
    }
}