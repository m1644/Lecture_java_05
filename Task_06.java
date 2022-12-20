import java.util.Hashtable;
import java.util.Map;

/**
 * Task_06 (HashTable)
 */
public class Task_06 {

    public static void main(String[] args) {
        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "один");
        table.put(11, "один один");
        table.put(2, "два");
        System.out.println(table);  // {2=два, 1=один, 11=один один}
        //table.put(null, "null");  // java.lang.NullPointerException
    }
}
