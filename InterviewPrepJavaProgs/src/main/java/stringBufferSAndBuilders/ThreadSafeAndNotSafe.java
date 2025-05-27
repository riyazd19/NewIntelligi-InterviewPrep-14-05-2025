package stringBufferSAndBuilders;

public class ThreadSafeAndNotSafe {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb= new StringBuilder();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    sb.append("A");
                }
            }
        };
        Thread t1= new Thread();
        Thread t2= new Thread();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final length (StringBuilder): " + sb.length());
    }
}
