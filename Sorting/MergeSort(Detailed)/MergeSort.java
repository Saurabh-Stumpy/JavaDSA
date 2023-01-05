import java.util.Arrays;

public class MergeSort {
    public static void MergeSort(int[] arr, int l, int r){
        // Dividing the array smaller parts
        // passing these parts to merge the arrays in sorted order
        if(r>l){
            int m = l+(r-l)/2;
            MergeSort(arr,l,m);
            MergeSort(arr,m+1,r);
            MergeFunc(arr,l,m,r);
        }
    }
    public static void MergeFunc(int[] arr, int low, int mid, int high){
        // Calculating the number of elements in each of the array
        int n1=mid-low+1;
        int n2= high-mid;
        // Creating 2 arrays
        int[] left = new int[n1];
        int[] right = new int[n1];
        //Copy elements from the left part to the left array
        // and from the right part to the right array
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+i+1];
        }
        //Merge the two arrays and push them to the main array in sorted order
        // Same as we did in MergeTwo SortedArray code
        int i=0;
        int j=0;
        int k=low;

        while(i<n1&&j<n2){
            if(left[i]>right[j]){
                arr[k]=right[j];
                k++;
                j++;
            }
            else{
                arr[k]=left[i];
                k++;
                i++;
            }
        }
        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        int[] abc = {1,3,4,2,5,6};

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(abc));

        MergeSort(abc,0,5);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(abc));
    }
}
