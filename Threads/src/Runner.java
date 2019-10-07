import java.util.concurrent.Semaphore;

public class Runner {
    public static void main(String[] args) {
        Semaphore parking = new Semaphore(5);

        for (int i = 1; i <= 10; i++) {
            new Car(parking, "Car" + i);
        }

    }
}
