import java.util.ArrayList;
import java.util.Arrays;
public class LinearSearchIndices {
    public static void main(String[] args) {

        int[] arr = {23, 54, 56, 34, 48, 67, 23, 43, 23};
        int target = 23;

        ArrayList<Integer> indices = SearchwithIndices(arr , target) ;

        if(indices.isEmpty()){
            System.out.print("Element not found.");
        }else {
            System.out.println("The apperance of target element is at : " + indices);
        }
    }
    static ArrayList<Integer> SearchwithIndices(int[] array , int target){
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                indices.add(i);
            }
        }
        return indices;
    }
}