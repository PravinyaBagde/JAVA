public class MaxLinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 56, 89 , 54, 73, 65, 98,43, 33, 31};
        int max = maxNum(arr);
        System.out.println("The maximum element present in the array is : " + max);
        //Here the maximum number is 98
    }
    public static int maxNum(int[] rr){
        int max = rr[0];
        for (int i = 0; i < rr.length; i++) {
            if(rr[i] > max){
                max = rr[i];
            }
        }
        return  max;
    }
}
