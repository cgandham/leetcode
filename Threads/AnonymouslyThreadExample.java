package Threads;

public class AnonymouslyThreadExample {
	
public static void main(String[] args) {
        
        // Create a new thread using an anonymous class
        Thread thread = new Thread(new Runnable() {
            public void run() {
                // Code to be executed in the new thread
                System.out.println("New thread started");
            }
        });
        
        // Start the thread
        thread.start();
        
        // Code to be executed in the main thread
        System.out.println("Main thread continues");
    }
	

}
