import java.util.HashMap;
import java.util.Map;

public class FrequencyArrayElements {

    public static void frequency(int[] arr){
        HashMap<Integer,Integer> h = new HashMap<>();

//        for(int i:arr){
//            h.put(i,h.getOrDefault(i,0)+1);
//        }
        for(int i:arr){
            if(h.containsKey(i)){
                h.put(i,h.get(i)+1); // As put function replaces the previous value in HashMap
            }
            else{
             h.put(i,1);
            }
        }

        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,4,6};
        frequency(arr);

    }
}
