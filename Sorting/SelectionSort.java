import java.util.Arrays;

public class SelectionSort {

    public static void selection(int[] arr,int n){
        // The main aim in selection sort is to place
        // the minimum element from array to the first
        // index and then incrementing the end
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,i,min);  // swapping the min element with the key element that is at i
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] abc = {9,4,7,2,8,5};

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(abc));

        selection(abc,abc.length);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(abc));
    }
}
