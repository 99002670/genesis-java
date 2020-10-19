import java.io.*;

public class FileDemo
{
	// public FileDemo()
	// {
	//
	// }

	public static void main(String args[]) throws Exception
	{
		FileInputStream fin = new FileInputStream("FileDemo.java");
		FileOutputStream fout = new FileOutputStream("FileDemo.pdf");
		// int ch = fin.read();
		// System.out.println(ch);
		// System.out.println((char)ch);

		// int fileSize = fin.available();
		// for(int i = 1; i <= fileSize; i++)
		// {
		// 	System.out.print((char)fin.read());
		// }

		byte bytes[] = new byte[fin.available()];
		fin.read(bytes);
		String data = new String(bytes);
		System.out.println(data);

		fout.write(bytes);

		fin.close();
		fout.close();

	}
}
