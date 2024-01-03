public class LinearSearch {
    public static void main(String[] args) {

        int myArray[] = {12, 34, 54, 53, 76, 23};
        int target = 53;

        int res = linearSearch(myArray, target);

        if (res != -1) {
            System.out.println("The target is found at index : " + res);
        } else {
            System.out.print("Target not found !!!");
        }
    }
        public static int linearSearch(int[] myArray, int target){
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }