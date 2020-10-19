import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

public class ReadConfigFile
{
	// public static void main(String args[]) throws IOException
	// {
	// 	FileInputStream fin = new FileInputStream("config.txt");
	// 	int size = fin.available();
	// 	System.out.println("File size = " + size);
	//
	// 	BufferedInputStream bin = new BufferedInputStream(fin);
	// 	byte bytes[] = new byte[size];
	// 	bin.read(bytes);
	// 	String data = new String(bytes);
	//
	// 	System.out.println(data);
	//
	// 	bin.close();
	// 	fin.close();
	// }

	public static void main(String args[]) throws Exception
	{
		FileReader reader = new FileReader("config.txt");
		BufferedReader bReader = new BufferedReader(reader);

		ArrayList<String> data = new ArrayList<String>();
		HashMap<String, String> config = new HashMap<String, String>();

		String line = null;
		while((line = bReader.readLine()) != null)
		{
			data.add(line);
		}
		Iterator<String> it = data.iterator();
		while(it.hasNext())
		{
			String tmp = it.next();
			if(tmp.charAt(0) == '#')
			{
				continue;
			}
			String elements [] = tmp.split("=");
			config.put(elements[0], elements[1]);
		}
		System.out.println(config);

		bReader.close();
		reader.close();
	}
}
