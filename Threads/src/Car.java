import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Car extends Thread {
    Semaphore semaphore;
    private String name;

    Car(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
        start();
    }


    @Override
    public void run() {
        System.out.printf("%s come to parking! And waiting...\n", this.name);
        try {
            if (semaphore.tryAcquire(5, TimeUnit.SECONDS)) {
                System.out.printf("%s parking!\n", this.name);
                Thread.sleep(4999);
                System.out.printf("%s is leaving!\n", this.name);
            } else {
                System.out.printf("The %s did not wait for a parking space and left\n", this.name);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
