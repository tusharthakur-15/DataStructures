import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        // gives keys in sorted order

        tm.put("Z", 1);
        tm.put("Y", 2);
        tm.put("X", 3);
        tm.put("W", 4);

        System.out.println(tm);
    }
}
