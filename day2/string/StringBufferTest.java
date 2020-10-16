public class StringBufferTest
{
    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer(1024);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        s1.append("vaskjfhjhasgflkadshjkghadlj");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.capacity());
    }
}
