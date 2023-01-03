import java.util.Arrays;

public class OptimisedBubbleSort {

    public static void bubble(int[] arr, int n){
        // Bubble sort is all about pushing the maximum element of the array to the end
        // By comparing 2 adjacent elements

        for(int i=0;i<n;i++){
            boolean flag = false;
            // added a flag to optimise the solution
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]){
                    flag = true;
                    swap(arr,j,j+1);
                }
            }
            if(flag == false) break;
            // If no swap takes place which means the array is sorted
            // and will be out of loop so for sorted array the time complexity
            // goes down to O(n)
        }
    }

    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
//        int[] abc = {9,4,7,2,8,5};
        int[] abc = {1,2,3,4,5,6};

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(abc));

        bubble(abc,abc.length);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(abc));
    }
}
