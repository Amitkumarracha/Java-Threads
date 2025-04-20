// Name: Amitkumar Racha
 // PRN:  24070126501
 // Batch: A1 (2023-27)

// Main.java

public class Main {
    /**
     * Main method - entry point of the program.
     * Creates and starts different thread objects.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Thread Demonstration Program Started");
        
        // Create thread objects
        CounterThread counterThread = new CounterThread("Counter-Thread", 5);
        MessageThread messageThread = new MessageThread("Message-Thread", 3);
        
        // Create Runnable implementation objects
        ResourceTask resourceTask = new ResourceTask("Resource-Task");
        Thread resourceThread = new Thread(resourceTask);
        
        // Start all threads
        System.out.println("Starting all threads...");
        counterThread.start();
        messageThread.start();
        resourceThread.start();
        
        try {
            // Wait for all threads to complete
            counterThread.join();
            messageThread.join();
            resourceThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All threads have completed execution");
        System.out.println("Thread Demonstration Program Ended");
    }
}