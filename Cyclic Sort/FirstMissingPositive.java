public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int result = missingPositive(arr);
        System.out.println("First missing positive integer: " + result);
    }

    public static int missingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int f, int l) {
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
}
