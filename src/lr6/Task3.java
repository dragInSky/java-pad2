package lr6;

public class Task3 {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) throws InterruptedException {
        Thread evenThread = new Thread(() -> printNumbers(0));
        Thread oddThread = new Thread(() -> printNumbers(1));

        evenThread.setName("Четный поток");
        oddThread.setName("Нечетный поток");

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();
    }

    private static void printNumbers(int remainder) {
        synchronized (lock) {
            while (number <= 10) {
                if (number % 2 == remainder) {
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            lock.notifyAll();
        }
    }
}
