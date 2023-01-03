import java.util.Arrays;

public class InsertionSort {

    public static void insertion(int[] arr, int n){
        // Insertion sort is dividing the array into two parts
        // One part is sorted and another is not and then
        // placing the element between these 2 array in the sorted array
        // such that the array remains sorted
        for(int i=1;i<n;i++){
            //Initialising the array from 1 as we consider 0 index as sorted
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] abc = {9,4,7,2,8,5};

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(abc));

        insertion(abc,abc.length);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(abc));
    }
}
