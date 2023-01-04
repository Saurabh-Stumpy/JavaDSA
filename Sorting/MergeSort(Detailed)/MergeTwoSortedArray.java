import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void mergeArray(int[] arr1,int[] arr2,int n1,int n2){

        //Creating a new array which can hold elements from both the arrays
        int[] sorted = new int[n1+n2];
        //initialising the pointers for all the 3 arrays
        // i is for arr1, j for arr2 and k for the new array which will
        // be created after merging the 2 arrays
        int i=0;
        int j=0;
        int k=0;

        while(i<n1 && j<n2){
            // Compare elements at the pointer from arr1 and arr2 select
            // minimum element from the two elements then push the element to the new array
            if(arr1[i]>arr2[j]){
                sorted[k]=arr2[j];
                k++;
                j++;
            }
            else{
                sorted[k]=arr1[i];
                k++;
                i++;
            }
        }
        // The loop stops when there are no elements left in one of the array to compare
        // so now we run another loop for the remaining element inside another array
        while (i<n1){
            sorted[k]=arr1[i];
            i++;
            k++;
        }
        while (j<n2){
            sorted[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(sorted));
    }


    public static void main(String[] args) {
        int[] abc = {2,4,6,9,10};
        int[] xyz = {1,3,5,7,8};

        mergeArray(abc,xyz,abc.length,xyz.length);

    }
}
