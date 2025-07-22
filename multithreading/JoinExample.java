package multithreading;

public class JoinExample {

    public static void main(String[] args) throws InterruptedException {
    	 System.out.println(Thread.activeCount());
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 starting...");
            try {
                Thread.sleep(1000); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 finished.");
        });
        System.out.println("created Virtual thread for t1");
        Thread.startVirtualThread(t1);
       
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 starting...");
            try {
                Thread.sleep(1200); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 finished.");
        });

        t1.start();
        t2.start();

        // Main thread waits for both threads to complete
       // t1.join();  // Wait for thread t1 to finish
       t2.join();  // Wait for thread t2 to finish

        System.out.println("Main thread resumes after t1 and t2.");
        System.out.println(Thread.activeCount());
    }
}

