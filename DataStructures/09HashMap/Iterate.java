import java.util.*;

public class Iterate {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C",3);
        hm.put("D", 4);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println(k+","+hm.get(k));
        }
    }
}
