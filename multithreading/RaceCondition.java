package multithreading;

public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
    	RaceConditionCounter counter = new RaceConditionCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 15000; i++) counter.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);  // Might not be 2000
    }

}
