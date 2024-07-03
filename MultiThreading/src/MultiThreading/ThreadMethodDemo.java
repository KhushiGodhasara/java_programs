package MultiThreading;

public class ThreadMethodDemo {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass(5, "First");
		ThreadClass t2 = new ThreadClass(8, "Second");
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("Parent Thread");//assign the name to current Thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Current Thread: " + Thread.currentThread());
		
		try
		{
			t1.join();//wait current thread until the t1 is dead
			t2.join();//wait current thread until the t2 is dead
		}
		catch(Exception e)
		{
			System.out.println("Thread is Interrupted");
		}
		System.out.println("----------End of Main----------");

	}

}
