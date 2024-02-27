public class CeilingNumber {
    public static void main(String[] args) {
        int[]arr = {1, 5, 8, 9, 16, 19};
        int target = 6;
        int ans = ceilingNumber(arr, target);
        System.out.println("The ceiling number of target element " + target + " is : " + ans);
    }
    public static int ceilingNumber(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid= start + (end - start) / 2;
            if(target == arr[mid]){
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        if(start < arr.length){
            return arr[start];
        }else {
            return -1;
        }
    }
}