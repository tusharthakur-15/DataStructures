import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        // key,value in order
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("A", 1);
        lhm.put("B", 2);
        lhm.put("C", 3);
        lhm.put("D", 4);

        System.out.println(lhm);

    }
}
