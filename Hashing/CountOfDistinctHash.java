import java.util.*;
public class CountOfDistinctHash {

    public static int countOfDisitinct(int[] arr){
        HashSet<Integer> h = new HashSet<>();

        for(int i:arr){
            h.add(i);
        }

        return h.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,1,3,5,0,8,9};

        System.out.println("Count of distinct elements in the array is :");
        System.out.println(countOfDisitinct(arr));
    }
}
