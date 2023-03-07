package Threads;
/*
 thread scheduler has the authority to interrupt, a running thread
  and move another thread to the running state.
  
  t1 and t2 that both execute an infinite loop
  no particular scheduling algorithm is specified
  thread scheduler will use preemptive scheduling to determine which thread to execute. 
  So, both threads will execute in random order, 
  with the scheduler interrupting each thread to allow the other thread to execute.
 */
public class PreemptiveSchedulingExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while(true) {
                System.out.println("Thread 1 is running");
            }
        });
        
        Thread t2 = new Thread(() -> {
            while(true) {
                System.out.println("Thread 2 is running");
            }
        });
        
        t1.start();
        t2.start();
    }
}

