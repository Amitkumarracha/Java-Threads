/**
 * A thread class that counts from 1 to a specified limit.
 * This class demonstrates extending the Thread class directly.
 */
public class CounterThread extends Thread {
    private int limit; // Maximum count value
    
    /**
     * Constructor to initialize the thread with a name and count limit.
     * 
     * @param name The name of the thread
     * @param limit The maximum count value
     */
    public CounterThread(String name, int limit) {
        super(name);
        this.limit = limit;
    }
    
    /**
     * The run method contains the code that is executed when the thread starts.
     * This method counts from 1 to the specified limit and displays each count.
     */
    @Override
    public void run() {
        try {
            System.out.println(getName() + " started");
            
            // Count from 1 to limit
            for (int i = 1; i <= limit; i++) {
                System.out.println(getName() + ": Count = " + i);
                
                // Sleep for 1 second between counts
                Thread.sleep(1000);
            }
            
            System.out.println(getName() + " finished");
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted: " + e.getMessage());
        }
    }
}