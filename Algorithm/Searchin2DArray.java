import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {28, 12, 3, 9},
                {78, 99 , 34, 56},
                {18, 12}
        };

        int target = 34;
        int[] ans = Searchie(arr , target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] Searchie(int[][] jar , int target){
        for (int row = 0; row < jar.length; row++) {
            for (int col = 0; col < jar[row].length; col++) {
                if(jar[row][col] == target){
                    return new int[]{row,col} ;
                }
            }
        }
        return new int[] {-1 , -1};
    }
}
