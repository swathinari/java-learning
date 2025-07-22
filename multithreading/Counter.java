package multithreading;

public class Counter {
    private int count = 0;

    public void increment() {
        synchronized(this) {
            count++;  // <-- This is now a protected critical section
        }
    }

    public synchronized int getCount() {
        return count;
    }
}

