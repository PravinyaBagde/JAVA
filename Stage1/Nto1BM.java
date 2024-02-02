import java.util.Scanner;
public class Nto1BM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.print("Enter the bit position (0-based index): ");
        int bitPosition = scanner.nextInt();

        scanner.close();

        int result = setNthBitToOne(number, bitPosition);

        System.out.println("Original number: " + number);
        System.out.println("Number after setting " + bitPosition + "th bit to 1: " + result);
    }
    public static int setNthBitToOne(int num, int position) {// Create a mask with only the Nth bit set to 1
        int mask = 1 << position;

        int result = num | mask;

        return result;
    }
}