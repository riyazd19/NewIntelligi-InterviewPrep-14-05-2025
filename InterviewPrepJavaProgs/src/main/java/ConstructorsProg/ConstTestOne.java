package ConstructorsProg;

public class ConstTestOne {
    String color;
    int x;
    ConstTestOne(String s, int x){
        this.color=s;
        this.x=x;
        System.out.println(color+" "+x);
    }

    public ConstTestOne() {

    }

    public static void main(String[] args) {
        ConstTestOne cs1= new ConstTestOne("abcd",12);
        System.out.println(cs1.color+","+cs1.x);
    }
}
