public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[]arr = {2,3,5,6,7,8,10,12,15,20,23,30};
        int target = 15;
        int ans = findIndex(arr,  target);
        System.out.println("Element found at index : " + ans);
    }
    public static int findIndex(int[]arr, int target){

        int start = 0;
        int end = 1;
        while(arr[end] < target){
            start = end;
            end = 2 * end;
        }
        return infiniteSearch(arr, target, start, end);
    }
    public static int infiniteSearch(int[]arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

