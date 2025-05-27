package ThreadsProg;

public class ParallelThreadsExample {
    public static void main(String[] args) {
        // Thread 1
        Thread t1 = new Thread(new MyRunnable("Thread-1"));

        // Thread 2
        Thread t2 = new Thread(new MyRunnable("Thread-2"));

        // Thread 3
        Thread t3 = new Thread(new MyRunnable("Thread-3"));

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}

// Runnable implementation without lambda
class MyRunnable implements Runnable {
    String threadName;

    MyRunnable(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // delay to simulate work
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}
