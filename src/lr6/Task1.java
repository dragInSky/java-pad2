package lr6;

import java.time.LocalTime;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = new Thread(Task1::printTime);
        Thread secondThread = new Thread(Task1::printTime);

        firstThread.setName("Первый поток");
        secondThread.setName("Второй поток");

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();
    }

    private static void printTime() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
