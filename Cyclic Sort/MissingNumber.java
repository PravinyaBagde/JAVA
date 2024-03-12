public class MissingNumber {
    public static void main(String[] args) {
        int[]arr = {3, 0, 1};
        int ans = cycleSort(arr);
        System.out.println("The missing number is : " + ans);
    }
    public static int cycleSort(int[]arr){
    int i = 0;

    while (i < arr.length){
        if(arr[i] < arr.length && arr[i] != i){
            swap(arr, i, arr[i]);
        }else {
            i++;
        }
    }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    public static void swap(int[]arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}