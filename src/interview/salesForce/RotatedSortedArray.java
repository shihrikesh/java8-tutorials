package interview.salesForce;

public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,5};
        int nemo = 2;
        int len = arr.length;
        int high = len-1;
        int low  = 0;
        int mid = len/2;
        int pivot=0;
        int position=-1;
        int a= arr[high];
        if(arr[mid] > arr[mid+1] ){
            pivot = mid;
            for(int i=pivot;i<high;i++){
                if(arr[i] == nemo){
                    position=i;
                    System.out.println(i);
                }
            }
        }

        if(arr[mid] < arr[mid-1]){
            pivot = mid-1;
            for(int i=pivot;i>=low;i--){
                if(arr[i] == nemo){
                    position = i;
                    System.out.println(i);;
                }
            }
        }
        System.out.println(position);



    }
}
