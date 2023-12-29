public class SimpleArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        myArray[2] = 10;
        System.out.println("Array length: " + myArray.length);
        System.out.println("Sum of array elements: " + java.util.Arrays.stream(myArray).sum());
    }
}
