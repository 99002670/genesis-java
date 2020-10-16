public class StringTest
{
    public static void main(String args[])
    {
        String s1 = "DATA";
        String s2 = "DATA";
        String s3 = new String("DATA");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        s1 = "DATA";
        s2 = "DATA2";
        // s1 = s1 + s2;
        System.out.println(s1);

        String s4 = new String("Welcome to JAVA");
        System.out.println(s4.length());

        System.out.println(s1.equals(s3));

        System.out.println(s1.concat(s2));
    }
}
