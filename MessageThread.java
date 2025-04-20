/**
 * A thread class that displays messages at regular intervals.
 * This class demonstrates extending the Thread class directly.
 */
public class MessageThread extends Thread {
    private int messageCount; // Number of messages to display
    
    /**
     * Constructor to initialize the thread with a name and message count.
     * 
     * @param name The name of the thread
     * @param messageCount The number of messages to display
     */
    public MessageThread(String name, int messageCount) {
        super(name);
        this.messageCount = messageCount;
    }
    
    /**
     * The run method contains the code that is executed when the thread starts.
     * This method displays a series of messages with delays between them.
     */
    @Override
    public void run() {
        try {
            System.out.println(getName() + " started");
            
            // Display messages
            for (int i = 1; i <= messageCount; i++) {
                System.out.println(getName() + ": Message #" + i + " - Thread demonstration in progress");
                
                // Sleep for 2 seconds between messages
                Thread.sleep(2000);
            }
            
            System.out.println(getName() + " finished");
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted: " + e.getMessage());
        }
    }
}