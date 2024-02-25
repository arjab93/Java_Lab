class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Count " + i);
        }
    }
}

public class MultiThreadRun{
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable, "Thread 1");
        Thread thread2 = new Thread(myRunnable, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
