import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[]arr = {3, 1, 5, 4, 2, 6};
        cycleSort(arr);

        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
    public static void cycleSort(int[]arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
    public static void swap(int[]arr, int first , int last){
           int temp = arr[first];
           arr[first] = arr[last];
           arr[last] = temp;
    }
}