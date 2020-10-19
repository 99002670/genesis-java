import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	String name;
	int marks[] = new int[5];
	int total;
	String result;
	char grade;

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setMarks(int marks[])
	{
		for(int i = 0; i < this.marks.length; i++)
		{
			this.marks[i] = marks[i];
		}
	}

	public int[] getMarks()
	{
		return this.marks;
	}

	public void calcTotal()
	{
		for(int i = 0; i < this.marks.length; i++)
		{
			this.total += marks[i];
		}
	}

	public int getTotal()
	{
		return this.total;
	}

	public void calcResult()
	{
		if(this.marks[0] >= 35 && this.marks[1] >= 35 && this.marks[2] >= 35 && this.marks[3] >= 35 && this.marks[4] >= 35)
		{
			this.result = "PASS";
		}
		else
		{
			this.result = "FAIL";
		}
	}

	public String getResult()
	{
		return this.result;
	}

	public void calcGrade()
	{
		if(this.result.equals("FAIL"))
		{
			this.grade = 'F';
		}
		else
		{
			if(this.total > 300)
			{
				this.grade = 'A';
			}
			else if(this.total > 250)
			{
				this.grade = 'B';
			}
			else if(this.total > 200)
			{
				this.grade = 'C';
			}
			else
			{
				this.grade = 'D';
			}
		}
	}

	public char getGrade()
	{
		return this.grade;
	}

	public void display()
	{
		System.out.print("Name: " + this.name + "\t");
		System.out.print("Mark1: " + this.marks[0] + "\t");
		System.out.print("Mark2: " + this.marks[1] + "\t");
		System.out.print("Mark3: " + this.marks[2] + "\t");
		System.out.print("Mark4: " + this.marks[3] + "\t");
		System.out.print("Mark5: " + this.marks[4] + "\t");
		System.out.print("Total: " + this.total + "\t");
		System.out.print("Result: " + this.result + "\t");
		System.out.print("Grade: " + this.grade + "\t");
		System.out.println();
	}

	@Override
	public int compareTo(Student student)
	{
		int total = student.getTotal();

		return total - this.total;
	}
}

public class StudentDetails
{
	public static void main(String args[]) throws Exception
	{
		FileReader reader = new FileReader("Student_Details.txt");
		BufferedReader bReader = new BufferedReader(reader);
		FileWriter writer = new FileWriter("Student_Details_Processed.txt");
		BufferedWriter bWriter = new BufferedWriter(writer);

		ArrayList<Student> studentList = new ArrayList<Student>();

		String line = null;
		while((line = bReader.readLine()) != null)
		{
			String elements [] = line.split(",");
			Student temp = new Student();

			temp.setName(elements[0]);
			int marks [] = new int[5];
			marks[0] = Integer.parseInt(elements[1]);
			marks[1] = Integer.parseInt(elements[2]);
			marks[2] = Integer.parseInt(elements[3]);
			marks[3] = Integer.parseInt(elements[4]);
			marks[4] = Integer.parseInt(elements[5]);
			temp.setMarks(marks);

			temp.calcTotal();
			temp.calcResult();
			temp.calcGrade();

			studentList.add(temp);
		}

		Collections.sort(studentList);

		for(Student s : studentList)
		{
			int marks [] = s.getMarks();
			String temp = s.getName() + "," + marks[0] + "," + marks[1] + "," + marks[2] + "," + marks[3] + "," + marks[4] + "," + s.getTotal() + "," + s.getResult() + "," + s.getGrade();
			bWriter.write(temp + "\n");
		}

		bReader.close();
		reader.close();
		bWriter.close();
		writer.close();
	}
}
