import java.util.HashMap;
public class Hashmap {

    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        hm.put("D", 4);
        System.out.println(hm);

        // get
        System.out.println(hm.get("A"));

        // containsKey
        System.out.println(hm.containsKey("A"));

        //remove - returns value of removed key
        System.out.println(hm.remove("B"));
        System.out.println(hm);
    }
}