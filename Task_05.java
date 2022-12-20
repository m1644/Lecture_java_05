import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Task_05 (LinkedHashMap)
 */
public class Task_05 {

    public static void main(String[] args) {
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "один");
        linkmap.put(2, "два");
        System.out.println(linkmap);  // {11=один один, 1=один, 2=два}
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(1, "один");
        map.put(2, "два");
        System.out.println(map);  // {1=один, 2=два, 11=один один}
    }
}
