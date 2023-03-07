package Threads;

public class Thread_RunnableInterface implements Runnable{
	
	@Override
	public void run() {
		System.out.println("running thread");
		
	}

	public static void main(String[] args) {
		//you need to pass a runnable your thread
		Thread t1 = new Thread(new Thread_RunnableInterface());
		t1.start();

	}

	

}
