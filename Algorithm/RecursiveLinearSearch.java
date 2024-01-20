public class RecursiveLinearSearch {
    public static void main(String[] args) {

        int[] arr = {12, 34, 65, 56, 46, 43 , 32} ;
        int target = 65;

        int ans = recursiveLS(arr, target , 0);
        System.out.print("The " + target + " is found at : " + ans);
    }
    public static int recursiveLS(int[]myArray , int target , int index){
        if(index == myArray.length){
            return -1;
        }
        if(myArray[index] == target){
            return index ;
        }
        return recursiveLS(myArray , target, index + 1);
    }

}
