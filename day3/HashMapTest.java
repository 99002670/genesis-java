import java.util.*;

public class HashMapTest
{
    public static void main(String args[])
    {
        HashMap<String, String> names = new HashMap<String, String>();

        names.put("name", "Name1");
        names.put("role", "DEV");
        names.put("id", "1111");
        names.put("grade", "A");

        System.out.println(names);

        System.out.println(names.get("role"));

        // names.remove("grade");
        // System.out.println(names);

        System.out.println(names.containsKey("grade"));

        Set <String> keys = names.keySet();
        System.out.println(keys);

        Iterator <String> it = keys.iterator();
        while(it.hasNext())
        {
            String key = it.next();
            System.out.println(key + "=>" + names.get(key));
        }
    }
}
