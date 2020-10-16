public class Outer
{
    public Outer()
    {
        System.out.println("Outer:constructor");
    }

    public void display()
    {
        System.out.println("Outer:display");
    }

    class Inner
    {
        public Inner()
        {
            System.out.println("Inner:constructor");
        }
        public void display()
        {
            System.out.println("Inner:display");
            Outer.this.display();
        }
    }

    Inner i = new Inner();
    i.display();
}
