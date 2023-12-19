public class MaxofThree {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 18;
        int num3 = 32;

        int maxNumber = findMax(num1, num2, num3);

        System.out.println("Maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + maxNumber);
    }

    static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}
