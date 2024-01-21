public class Main {
    public static void main(String[] args) {

        int []arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45 , 89};
        int target = 16 ;
        int ans = binarySearch(arr , target);
        System.out.println("The element is present at : " + ans);
    }
    static int binarySearch(int[]array , int target){
        int start = 0;
        int end = array.length - 1;

        while (start <= target){
            int mid = start + (end - start) / 2;
            if(target < array[mid]){
                end = mid - 1;
            } else if (target > array[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
return  -1;
    }
}