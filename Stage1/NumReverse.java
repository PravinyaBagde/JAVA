public class NumReverse {
    public static void main(String[] args) {

        int n = 57393;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            count = count * 10 + rem;
        }
        System.out.println("The reverse is " + count);
    }}

// The reverse of number program is already present in the STAGE 0 but we are solving this again as it includes while lopp to solve this problem.