import java.util.Arrays;

public class ArrayReverse{
    public static void main(String[] args) {
        int[] arr = {12,34,45,76,89,23};
        swap(arr , 2 , 3);
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr , int index2 , int index3){
        int temp = arr[index2];
        arr[index2] = arr[index3];
        arr[index3] = temp;
    }
}