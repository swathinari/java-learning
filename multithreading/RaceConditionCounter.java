package multithreading;

public class RaceConditionCounter {
	    int count = 0;
	    public synchronized void increment() {
	        count++;  // Not thread-safe
	    }
	}


