import java.util.Arrays;

public class QuickSortHoare {

    public static void quicksort(int[] arr,int l,int h){
        if(l<h){
            int m =hoarePartition(arr, l, h);
            quicksort(arr,l,m);
            quicksort(arr,m+1,h);
        }
    }
    public static int hoarePartition(int[] arr,int l,int h){
        int i= l-1;
        int j= h+1;
        int pivot = arr[l];

        while (true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j){
                return j;
            }
            swap(arr,i,j);
        }

    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,7,4,6,5};

        quicksort(arr,0,6);

        System.out.println(Arrays.toString(arr));
    }
}
