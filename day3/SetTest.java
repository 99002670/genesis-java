import java.util.*;

public class SetTest
{
    public static void main(String args[])
    {
        HashSet <String> names = new HashSet<String>();

        names.add("Name1");
        names.add("Name2");
        names.add("Name3");
        names.add("Name1");
        names.add("Name5");
        names.add("Name2");

        System.out.println(names);

        Iterator <String> it = names.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
