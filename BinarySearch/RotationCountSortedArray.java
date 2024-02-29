public class RotationCountSortedArray {
    public static void main(String[] args) {
        int[]arr = {15, 18, 20, 2, 3, 6, 12};
        int ans = rotationCount(arr);
        System.out.println("The array is rotated " + ans + " times.");
    }
    public static int rotationCount(int[]arr) {

        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end]) {
            return 0;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;

            } else if (arr[mid] < arr[mid - 1]) {
                return mid;

            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;

            } else if (arr[end] >= arr[mid]) {
                end = mid - 1;
            }
        }
        return 0;
    }
}
