public class IncreasingSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 8};
        System.out.println("Is sorted : " + isSorted(arr, 0));
    }
    public static boolean isSorted(int[]arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
      return  isSorted(arr, index+1);
    }
}