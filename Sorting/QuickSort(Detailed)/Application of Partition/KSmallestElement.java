public class KSmallestElement {

    public static int kthSmallestElement(int[] arr,int n,int k){

        int low = 0;
        int high = n-1;

        while (low<=high){
            int p = lomutoPartition(arr,low,high);
            if(p==k-1){
                return p;
            }
            else if (p>k-1){
                high = p-1;
            }
            else{
                low = p+1;
            }
        }
        return -1;
    }

    public static int lomutoPartition(int[] arr,int l,int h){
        int i=l-1;
        int pivot = arr[h];

        for(int j=l;j<h;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,9,4,1,7}; // 1,2,4,7,9
        int k = 5;

        System.out.println(arr[kthSmallestElement(arr,arr.length,k)]);

    }
}
