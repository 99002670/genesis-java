import java.io.*;

public class ReaderWriterTest
{
	// public Test()
	// {
	//
	// }

	public static void main(String args[]) throws Exception
	{
		// InputStreamReader inp = new InputStreamReader(System.in);
		// char name[] = new char[64];
		// inp.read(name, 0, 64);
		// String nameS = new String(name);
		// System.out.println(nameS);

		// BufferedInputStream bin = new BufferedInputStream(inp);

		FileReader reader = new FileReader("ReaderWriterTest.java");
		FileWriter writer = new FileWriter("Test2.java");

		BufferedReader br = new BufferedReader(reader);
		BufferedWriter bw = new BufferedWriter(writer);

		// String line = br.readLine();
		// int ch = reader.read();
		// // System.out.println(ch);
		// System.out.println(line);

		String line = null;
		while((line = br.readLine()) != null)
		{
			bw.write(line + "\n");
		}

		br.close();
		bw.close();
		reader.close();
		writer.close();
		// bw.close();
		// br.close();
	}
}
