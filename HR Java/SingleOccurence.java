import java.util.ArrayList;

public class SingleOccurence {
    public static void main(String[] args) {
        int[] arr = {12, 12, 3, 3, 56, 5,5,6 ,6};
        int ans = findOnce(arr);

        if(ans != 0){
            System.out.println("Element occuring only once is : " + ans);
        }else {
            System.out.println("No unique element !!!!");
        }
    }
    public static int findOnce(int[]arr){
        ArrayList<Integer> uniqueNum = new ArrayList<>();

        for (int num : arr) {
            if (uniqueNum.contains(num)) {
                uniqueNum.remove(Integer.valueOf(num));
            } else {
                uniqueNum.add(num);
            }
        }
        if(uniqueNum.size() == 1){
            return uniqueNum.get(0);
        }else {
            return -1;
        }
    }
}
