import java.util.Arrays;

public class HoarePartition {

    public static int hoarePartition(int[] arr,int l,int h){
        int i= l-1;
        int j= h;
        int pivot = arr[0];

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
        int[] arr = {40,10,90,30,70,60,20,50};

        System.out.println("Before Partition : ");
        System.out.println(Arrays.toString(arr));

        System.out.println(hoarePartition(arr,0,arr.length-1));

        System.out.println("After Partiotion : ");
        System.out.println(Arrays.toString(arr));
    }
}
