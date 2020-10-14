public class Student
{
	public int sid;
	protected float grade;
	private char gender;

	public static int count = 0;

	public static void showCount()
	{
		System.out.println(Student.count);
	}

	{
		System.out.println("******************");
	}

	public Student()
	{
		sid = 10;
		grade = 2.34f;
		gender = 'F';
	}

	public Student(int sid, float grade, char gender)
	{
		this.sid = sid;
		this.grade = grade;
 		this.gender = gender;
	}

	public Student(Student student)
	{
		this.sid = student.sid;
		this.grade = student.grade;
		this.gender = student.gender;
	}

	public void display()
	{
		System.out.println(this.sid + this.grade + this.gender);
	}

	public void setGender(char gender)
	{
		this.gender = gender;
	}

	public char getGender()
	{
		return gender;
	}
}
