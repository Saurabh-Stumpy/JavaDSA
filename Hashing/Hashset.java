import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("GitHub");  // To add to the HashSet
        h.add("JAVA");
        h.add("DSA");
        h.remove("JAVA"); // To Remove from the HashSet

        System.out.println(h.size());
        System.out.println(h); // prints all the elements in HashSet
        System.out.println(h.contains("abc")); // Prints false as abc is not present
        System.out.println(h.contains("DSA")); // Prints true as DSA is present in O(1) on average
        System.out.println(h.contains("dsa"));  // Prints false as DSA is in upper case ,and we are searching for lower case dsa
        System.out.println(h.isEmpty()); // Returns false as the HashSet is not empty

        Iterator<String> i = h.iterator();

        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        for(String str:h){
            System.out.print(str + " ");
        }

        h.clear(); // To clear the HashSet

    }
}
