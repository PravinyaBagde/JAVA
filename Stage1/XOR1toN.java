public class XOR1toN {
    public static void main(String[] args) {
        int n = 10;
        int res = ComputeXOR(n);
        System.out.println("XOR from 1 to 10 is : " + res);
    }

    public static int ComputeXOR(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result = result ^ i;
        }
        return result;
    }
}