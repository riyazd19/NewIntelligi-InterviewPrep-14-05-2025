package superKeyword;

import java.net.http.HttpRequest;

public class SuperTestOne {
    public static void main(String[] args) {
    //    HttpRequest postReq= HttpRequest.newBuilder()
       Cat c= new Cat();
        Animal a= new Cat();
        a.color();
       // c.makesound();

    }

}

class Animal{
    public void color(){
        System.out.println("every animal has color");

    }

}
class Cat extends Animal {
    @Override
    public void color() {
        System.out.println("meow meow");
    }

}