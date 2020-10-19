class MyThread extends Thread
{
	int data;
	public MyThread(int data)
	{
		this.data = data;
	}

	public void run() // Thread function
	{
		for(int i= 1; i <= 5; i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
			System.out.println("MyThread.run...");
		}
	}
}
public class ThreadingDemo
{
	public static void main(String args[])
	{
		MyThread thread1 = new MyThread(10); // Create thread
		thread1.start();
		thread1.join();
		System.out.println("Main thread ends...");
	}
}
