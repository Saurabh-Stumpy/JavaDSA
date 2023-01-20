import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static int intersection(int[] arr1,int[] arr2){
        int count = 0;
        HashSet<Integer> h = new HashSet<>();

        for(int i:arr1){
            h.add(i);
        }
        for(int i:arr2){
            if(h.contains(i)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2= {1,2,3,4};

        System.out.println("Number of element that intersect :");
        System.out.println(intersection(arr,arr2));

    }
}
