import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        System.out.print("Enter your number of array elements : ");
        Scanner ip = new Scanner(System.in);


        int size = ip.nextInt();
        int number[] = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.print("Enter the elements of your array : ");
            number[i] = ip.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascendiing order.");
        }
    }
}