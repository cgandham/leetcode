package Threads;

public class TwoThreadExample {
	
	private static int sharedResource = 0;
    
    public static void main(String[] args) {
        
        // Define the two tasks
        Runnable task1 = new Runnable() {
            public void run() {
                System.out.println("Task 1 started");
                // perform task 1 here
                //object of class is used as monitor to synchronize this block of code
                //regardless of which instance TwoThreadExample class uses, this block is synchronized
                synchronized(TwoThreadExample.class) {
                	sharedResource++;
                    System.out.println("Task 1 incremented shared resource to " + sharedResource);
                }
            }
        };
        
        Runnable task2 = new Runnable() {
            public void run() {
                System.out.println("Task 2 started");
                // perform task 2 here
                synchronized(TwoThreadExample.class) {
                sharedResource--;
                System.out.println("Task 2 decremented shared resource to " + sharedResource);
                }
            }
        };
        
        // Create a thread for each task
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        
        // Start each thread
        thread1.start();
        thread2.start();
        
        try {
            // Wait for the threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Perform any necessary cleanup or post-processing here
    }
}

