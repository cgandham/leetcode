package Threads;
/*
 each thread should sleep for 1 second between iterations. 
 This effectively implements time slicing,
  as each thread will execute for a fixed amount of time (1 second)
   before being preempted/interrupted to allow the other thread to execute
 both threads get a fair share of CPU time
 */
public class TimeSlicingExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("Thread 1 is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("Thread 2 is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        t1.start();
        t2.start();
    }
}

