public class SearchInRange {
    public static void main(String[] args) {

        int []arr = {18, 12, -7 , 3, 14 , 28};
        int target = 13 ;
        int ans = rangeSearch(arr, target, 2 , 6);
        System.out.println(ans) ;
    }

    public static int rangeSearch( int[]jar , int target, int start, int end){
        for (int i = 0; i < jar.length; i++) {
            if(jar[i] == target){
                return i;
            }
        }
        return -1 ;
    }
}
