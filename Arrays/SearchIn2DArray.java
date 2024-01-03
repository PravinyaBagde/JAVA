import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 34;
        int[] ans = search(arr, target);

        // Check if the target is found in the 2D array
        if (ans != null) {
            System.out.println("Target found at row " + ans[0] + " and column " + ans[1]);
        } else {
            System.out.println("Target not found in the array");
        }
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    // Return the indices if the target is found
                    return new int[]{row, col};
                }
            }
        }
        // Return null if the target is not found
        return null;
    }
}
