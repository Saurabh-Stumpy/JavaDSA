import java.util.*;


public class BubbleSort {
    public static void bubble(int[] arr, int n){
        // Bubble sort is all about pushing the maximum element of the array to the end
        // By comparing 2 adjacent elements

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] abc = {9,4,7,2,8,5};

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(abc));

        bubble(abc,abc.length);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(abc));
    }
}
