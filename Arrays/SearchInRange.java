public class SearchInRange {
    public static void main(String[] args) {

        int[] myArray = {18, 12, -7, 3, 14, 28};
        int target = 1842 ;

        int res = Range(myArray, target);
        System.out.println(res);
    }

    static int Range(int[] myArray, int target) {
        if (myArray.length == 0) {
            return -1;
        }
        for (int i = 2; i < 5; i++) {
            if (myArray[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
