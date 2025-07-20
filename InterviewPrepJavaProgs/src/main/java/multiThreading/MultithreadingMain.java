package multiThreading;

public class MultithreadingMain {
    public static void main(String[] args) {

        MultithreadingThing myThing = new MultithreadingThing();
        MultithreadingThing myThing1 = new MultithreadingThing();
        for(int i=0;i<=2;i++) {
            myThing.start();
        }
        myThing1.start();

    }
}
