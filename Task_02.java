import java.util.HashMap;
import java.util.Map;

/**
 * Task_02 (HashMap Работа с парами)
 */
public class Task_02 {

    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db);    // {1=один, 2=два, 3=три}

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
            // [1: один]
            // [2: два]
            // [3: три]
        }
        
    }
}
