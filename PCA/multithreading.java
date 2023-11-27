class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class multithreading {
    public static void main(String args[]) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
