import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<String,Integer>();

        h.put("GitHub",1);
        h.put("JAVA",2);
        h.put("DSA",3);

        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.containsKey("JAVA"));
        h.remove("JAVA");

        for(Map.Entry<String,Integer> e:h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println(h.get("DSA")); // Returns the value for that particular key

    }
}
