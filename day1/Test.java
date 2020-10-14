public class Test
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		Student s2 = new Student(11, 6.7f, 'F');
		Student s3 = new Student(s2);

		s1.sid = 100;
		s1.grade = 8.5f;
		s1.setGender('M');
		s1.display();

		s2.display();

		s3.display();

		System.out.println("Count= " + Student.count);
		System.out.println(s1.count);
		s1.count = 200;
		System.out.println(s2.count);
	}
}
