package interview.codingPractice;

public class RotatingArray {

    public static void main(String[] args) {
        // int [] {3,4,2,6,7}, n = 5 , k = 3
        // array with 5 character, rotate 3 times
        // int [] {2,6,7,3,4}
        int [] array1 = {10, 34, 56, 23, 78, 12, 13, 65};//{3,4,2,6,7};
        int k =5;//3;
        int len = array1.length;
        int [] array2 = new int[len];

        int temp;
        for(int i=k;i >0;i--){
            temp = array1[len-i];
            array2[i] = array1[len-i];
            //array2[i+1]= temp;
            System.out.println(temp);
        }
        int l=0;
        for(int i=k;i<len;i++){
            array2[k] = array1[l];
            l++;
            System.out.println(array2[k]);
        }
        System.out.println(" Check Elemts ");
        for(int i=0;i<len;i++){
            System.out.println(array2[i]);
        }

    }
}
