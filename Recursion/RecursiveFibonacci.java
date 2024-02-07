public class RecursiveFibonacci {
    public static void main(String[] args) {
        int n = 7;
        int ans = rFibonacci(n);

        System.out.println("Fibonacci number at  " + n + " position  is : " + ans);
        for (int i = 0; i < n; i++) {
            System.out.print(rFibonacci(i) + " ");
        }
    }

    static int rFibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return rFibonacci(n - 1) + rFibonacci(n - 2);
        }
    }
}
