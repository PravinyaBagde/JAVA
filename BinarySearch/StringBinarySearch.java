public class StringBinarySearch {

    public static int stringBinarySearch(String[] array, String target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparisonResult = array[mid].compareTo(target);

            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] sortedStrings = {"apple", "banana", "grape", "orange", "pear", "strawberry"};
        String target = "orange";

        int result = stringBinarySearch(sortedStrings, target);

        if (result != -1) {
            System.out.println("Element found at index  : "  + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
