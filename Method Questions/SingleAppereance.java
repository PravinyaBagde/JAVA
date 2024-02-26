public class SingleAppereance {
    public static void main(String[] args) {
        int[]arr = {1, 1, 2, 3, 2, 3, 4, 5, 5};
        int ans = uniqueElement(arr);
        System.out.println(ans);
    }
    public static int uniqueElement(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
            return result;
        }
    }
