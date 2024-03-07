import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        missingNumber(arr);
    }

    public static void missingNumber(int[] arr) {
        HashMap<Integer, Boolean> set = new HashMap<>();
        int sum = 0;
        for (int val : arr) {
            set.put(val, true);
            sum += val;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!set.containsKey(i)) {
                System.out.println("The missing number is : " + i);
                return;
            }
        }
        System.out.println("No missing number");
    }
}