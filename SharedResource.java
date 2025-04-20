/**
 * A class representing a shared resource that can be accessed by multiple threads.
 * This class demonstrates thread synchronization concepts.
 */
public class SharedResource {
    private boolean inUse = false; // Flag to track if resource is in use
    
    /**
     * Synchronized method to access the resource.
     * This method demonstrates thread synchronization using the synchronized keyword.
     * 
     * @param threadName The name of the thread accessing the resource
     * @throws InterruptedException If the thread is interrupted while sleeping
     */
    public synchronized void accessResource(String threadName) throws InterruptedException {
        // Check if resource is already in use
        if (inUse) {
            System.out.println(threadName + ": Resource is busy, waiting...");
            wait(); // Wait until resource becomes available
        }
        
        // Mark resource as in use
        inUse = true;
        System.out.println(threadName + ": Resource access granted");
        
        // Simulate using the resource
        System.out.println(threadName + ": Using the resource...");
        Thread.sleep(1000); // Simulate work being done
        
        // Release the resource
        inUse = false;
        System.out.println(threadName + ": Resource released");
        
        // Notify waiting threads that resource is available
        notify();
    }
}