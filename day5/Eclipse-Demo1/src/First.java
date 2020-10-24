public class First
{
    public static void showGender(Human obj)
    {
        System.out.println(obj.getGender());
    }

    public static void main(String args[])
    {
        Human m = new Male();
        showGender(m);
        Human f = new Female();
        showGender(f);
    }
}