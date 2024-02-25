class First extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Second extends Thread {

    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadInterval {
    public static void main(String[] args) {
        Thread first = new First();
        Thread second = new Second();
        first.start();
        second.start();
    }
}
