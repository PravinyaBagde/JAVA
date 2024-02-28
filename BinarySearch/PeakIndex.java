public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 12, 9, 5, 2};
        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println("The peak index is: " + peakIndex);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}