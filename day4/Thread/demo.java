class Data
{
	synchronized public void modify()
	{
		for(int i= 1; i <= 5; i++)
		{
			System.out.println("Data.modify by: " + Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
			// System.out.println("MyThread.run...");
		}
	}
}

class MyThread extends Thread
{
	Data commonData;
	public MyThread(Data data)
	{
		this.commonData = data;
	}

	public void run() // Thread function
	{
		// for(int i= 1; i <= 5; i++)
		// {
		// 	try {
		// 		Thread.sleep(1000);
		// 	}
		// 	catch(Exception e) {}
		// 	System.out.println("MyThread.run...");
		// }
		commonData.modify();
	}
}
public class demo
{
	public static void main(String args[])
	{
		Data commonData = new Data();
		MyThread th1 = new MyThread(commonData);
		MyThread th2 = new MyThread(commonData);
		// MyThread runnableObj = new MyThread(10); // Create thread
		// Thread thread1 = new Thread(runnableObj);
		// thread1.strat();
		// thread1.join();

		// th1.setPriority(1); // Normal(1) Medium(5) High(10)

		th1.start();
		th2.start();

		try{
			th1.join();
		}
		catch(Exception e){}
		try{
			th2.join();
		}
		catch(Exception e){}

		System.out.println("Main thread ends...");
	}
}
