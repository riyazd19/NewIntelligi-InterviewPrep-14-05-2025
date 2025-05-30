package ConstructorsProg;

public class ConstTestTwo {
    String str1;
    int x;

    ConstTestTwo() {
        System.out.println("after second object");

    }

    public ConstTestTwo(String str, int i) {
        this.str1 = str;
        this.x = i;
        System.out.println(str1 + " " + i);
    }

    public static void main(String[] args) {
        ConstTestTwo obj = new ConstTestTwo("abcd", 55);
        ConstTestTwo obj1 = new ConstTestTwo();

    }

}
