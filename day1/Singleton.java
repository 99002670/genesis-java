public class Singleton
{
    private static Singleton p = null;
    public int value;

    private Singleton(int value)
    {
        this.value = value;
    }

    public void display()
    {
        System.out.println(this.value);
    }

    public static Singleton getObject(int value)
    {
        if(p == null)
        {
            p = new Singleton(value);
        }
        return p;
    }
}
