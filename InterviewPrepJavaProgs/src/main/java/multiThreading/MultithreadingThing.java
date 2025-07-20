package multiThreading;

public class MultithreadingThing extends Thread  {

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("this is from thread: - "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
