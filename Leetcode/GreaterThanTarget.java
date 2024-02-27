public class GreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'f', 'h'};
        char target = 'd';
        char result = nextGreatestLetter(letters, target);
        System.out.println("The character greater than the target element is : " +  result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
         if(start < letters.length){
             return letters[start];
         }else {
             return letters[0];
         }
    }
}
