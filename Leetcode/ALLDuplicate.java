import java.util.ArrayList;
import java.util.List;

public class ALLDuplicate {
    public static void main(String[] args) {
        int[]arr = {4, 3, 2, 7, 8, 2, 3, 1};
       List<Integer> ans = findDuplicates(arr);
        System.out.println("All the duplicates are : " + ans);
    }
    public static  List<Integer> findDuplicates(int[] arr) {
          int i =0;
          while(i < arr.length){
              int correct = arr[i] - 1;

              if(arr[i] != arr[correct]){
                  swap(arr, i, correct);
              }else {
                  i++;
              }
          }
          List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    public static void swap(int[]arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
}