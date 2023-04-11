package classroom;

public class TwoSum {

    public static void main(String[] args) {
        //[3,2,4] and 6

        int [] num = {2,7,11,15};// {3,2,4};
        int tar = 9;//6;
        //int[] arr = getSum(num, tar);
        int[] arr = getSumOpt(num, tar);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static int[] getSumOpt(int[] numArr, int target){
        int[] returnArr = new int[2];
        for(int i=0;i<numArr.length;i++){
            int delta = target-numArr[i];
            for(int k=i+1;i<numArr.length&& k<numArr.length;k++){
                if(numArr[k] ==delta){
                    returnArr[0]=i;
                    returnArr[1] =k;
                    break;
                }
            }
        }
        return returnArr;
    }

    private static int[] getSum(int[] numArr, int target){
        // o(n2) and o(1) brute force
        int[] returnArr = new int[2];
        for(int i=0;i<numArr.length;i++){
            for(int k=i+1;k<numArr.length;k++){
                int sum = numArr[i]+numArr[k];
                if(sum== target){
                    returnArr[0] = i;
                    returnArr[1] = k;
                    break;
                }
            }
        }
        return returnArr;
    }
}
