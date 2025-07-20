package ConstructorsProg;

public class ConstTestThree {
    String name;
    ConstTestThree(){
        System.out.println("will display the name now");
        name= "john";
    }

    public static void main(String[] args) {
        ConstTestThree c= new ConstTestThree();
        System.out.println(c.name);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int max= Integer.MAX_VALUE;
        System.out.println(max+1);


    }
}
