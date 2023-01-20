
public class CountInversion {
    public static int mergeSort(int[] arr, int l,int r){
        int res =0;
        if(r>l){
            int m = l + (r-l)/2;
            res+= mergeSort(arr,l,m);
            res+= mergeSort(arr,m+1,r);
            res+= mergeFunc(arr,l,m,r);
            //System.out.println(l+" "+m+" "+r);
        }
        return res;
    }

    public static int mergeFunc(int[] arr,int l,int m,int r){

        int res = 0;
        int n1 = m-l+1;
        int n2 = r-m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+i+1];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1&& j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                k++;
                res+=(n2-i);
            }
        }
        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,7,3,5};

        System.out.println(mergeSort(arr,0,arr.length-1));

    }
}
