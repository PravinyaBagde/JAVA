public class Factorial{
    public static void main(String[] args) {
        int number = 5;
        long factorialResult = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }

    static long calculateFactorial(int n) {
        if (n < 0) {
            // Factorial is not defined for negative numbers
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
