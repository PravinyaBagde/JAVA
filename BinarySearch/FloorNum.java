public class FloorNum {
    public static void main(String[] args) {
      int[]arr = {1, 4, 5, 8, 13, 19};
      int target = 16;
      int ans = floorNum(arr, target);
        System.out.println("The floor number of target " + target + " is : " + ans);
    }
    public static int floorNum(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end -start)/2;

            if(arr[mid] == target){
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        if(start < arr.length){
            return arr[end];
        }else {
            return -1;
        }
    }
}
