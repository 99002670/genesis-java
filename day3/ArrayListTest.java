import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest
{
    public static void main(String args[])
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");
        names.add("Name4");
        names.add("Name5");
        names.add("Name6");

        System.out.println(names);
        System.out.println("Size = " + names.size());
        System.out.println(names.get(1));
        System.out.println("----------------------------");
        // for(String s : names)
        // {
        //     System.out.println(s);
        // }

        Iterator <String> it = names.iterator();
        // System.out.println(it.next());
        // System.out.println(it.next());
        System.out.println(it.hasNext());

        System.out.println("----------------------------");
        // names.remove(1);
        System.out.println(names);
        // names.remove("Name3");
        System.out.println(names);

        System.out.println("##############################");

        while(it.hasNext())
        {
            String tmp = it.next();
            if("Name3".equals(tmp));
            {
                it.remove();
            }
            System.out.println(names);
        }

        

    }
}
