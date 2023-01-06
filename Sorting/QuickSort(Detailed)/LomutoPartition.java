import java.util.Arrays;

public class LomutoPartition {

    public static void lomutoPartition(int[] arr,int l,int h){
        int pivot = arr[h];
        int i=l-1;

        for(int j=0;j<h;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
    }

    public static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    public static void main(String[] args) {
        int[] arr = {40,10,90,30,70,60,20,50};

        System.out.println("Before Partition : ");
        System.out.println(Arrays.toString(arr));

        lomutoPartition(arr,0,arr.length-1);

        System.out.println("After Partiotion : ");
        System.out.println(Arrays.toString(arr));
    }
}
