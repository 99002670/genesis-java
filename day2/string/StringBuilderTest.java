public class StringBuilderTest
{
    public static void main(String args[])
    {
        StringBuilder s1 = new StringBuilder("Test");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        s1.append("vaskjfhjhasgflkadshjkghadlj");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.capacity());
    }
}
