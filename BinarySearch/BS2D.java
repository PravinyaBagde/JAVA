public class BS2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int target = 26;
        boolean found = searchMatrix(matrix, target);

        if (found) {
            System.out.println("Target found in the matrix!");
        } else {
            System.out.println("Target not found in the matrix.");
        }
    }
   
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix == null) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midValue = matrix[mid / col][mid % col];

            if (target == midValue) {
                return true;
            } else if (target > midValue) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
