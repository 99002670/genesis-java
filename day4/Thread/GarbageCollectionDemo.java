class Data
{
	int id;
	public Data(int id)
	{
		this.id = id;
	}
	public void finalize()
	{
		System.out.println("Removing object: " + this.id);
	}
}
public class GarbageCollectionDemo
{

	public static void main(String args[])
	{
		Data d1 = new Data(11);
		Data d2 = new Data(12);
		d1 = null;
		d2 = null;
		System.gc();
	}
}
