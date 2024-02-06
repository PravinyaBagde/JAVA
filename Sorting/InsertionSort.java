public class InsertionSort {
    public static void main(String[] args) {
        int[]arr = {12,43,22,3,5,8,54,87};
        insertionSort(arr);

        System.out.println("Sorted array is - ");
        printArray(arr);
    }
    static void insertionSort(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = current;
        }
    }
        public static void printArray(int[]arr){
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}