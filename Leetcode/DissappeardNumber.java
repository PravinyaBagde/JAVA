import java.util.ArrayList;
import java.util.List;

public class DissappeardNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> disappearedNumbers = disappearNum(arr);
        System.out.println("The disappeared numbers are: " + disappearedNumbers);
    }

    public static List<Integer> disappearNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] == index + 1) {
                    ans.add(index + 1);
                }
            }
            return ans;
        }
    public static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
