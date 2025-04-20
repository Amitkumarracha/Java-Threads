/**
 * A class that implements Runnable interface to be executed by a Thread.
 * This class demonstrates implementing the Runnable interface as an alternative
 * to extending the Thread class.
 */
public class ResourceTask implements Runnable {
    private String taskName; // Name of the task
    private SharedResource resource; // Shared resource object
    
    /**
     * Constructor to initialize the task with a name.
     * 
     * @param taskName The name of the task
     */
    public ResourceTask(String taskName) {
        this.taskName = taskName;
        this.resource = new SharedResource();
    }
    
    /**
     * The run method contains the code that is executed when the thread starts.
     * This method demonstrates accessing a shared resource from a thread.
     */
    @Override
    public void run() {
        try {
            System.out.println(taskName + " started");
            
            // Access the shared resource multiple times
            for (int i = 1; i <= 3; i++) {
                System.out.println(taskName + ": Accessing shared resource - Attempt " + i);
                
                // Access the shared resource
                resource.accessResource(taskName);
                
                // Sleep for 1.5 seconds between access attempts
                Thread.sleep(1500);
            }
            
            System.out.println(taskName + " finished");
        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted: " + e.getMessage());
        }
    }
}