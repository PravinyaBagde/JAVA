//A monotonic array is an array that is either truely
// increasing or truely decreasing .
public class MonotonicArray {
    public static void main(String[] args) {
        int[] arr = {12, 4, 56, 78, 90};
        boolean ans = monotonicArray(arr);
        System.out.println("Is a monotonic array ? : " +  ans);
    }
    public static boolean monotonicArray(int[]arr){
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]){
                decreasing = false;
            }if(arr[i] > arr[i+1]){
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
