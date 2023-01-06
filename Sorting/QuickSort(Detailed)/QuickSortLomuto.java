import java.util.Arrays;

public class QuickSortLomuto {

    public static void quickSort(int[] arr,int l,int h){
        if(l<h){
            int m=lomuto(arr,l,h);
            quickSort(arr,l,m-1);
            quickSort(arr,m+1,h);
        }
    }
    public static int lomuto(int[] arr,int l,int h){
        int i = l-1;
        int pivot = arr[h];

        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);

        return i+1;
    }

    public static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,7,4,6,5};

        quickSort(arr,0,6);

        System.out.println(Arrays.toString(arr));
    }
}
