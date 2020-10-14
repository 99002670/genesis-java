public class SingletonTest
{
    public static void main(String args[])
    {
        Singleton s1 = Singleton.getObject(10);
        s1.display();
        Singleton s2 = Singleton.getObject(20);
        s2.display();
    }
}
