public class StringByteTest
{
    public static void main(String arg[])
    {
        String s1 = new String("Welcome to JAVA");
        byte[] bytes = s1.getBytes();
        System.out.println(bytes);
        String s2 = new String(bytes);
        System.out.println(s2);
    }
}
