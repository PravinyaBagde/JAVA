public class PowerRecursive {
    public static void main(String[] args) {
        int x = 2; //base
        int n = 4; //exponent
        System.out.println(x + " raised to the power of " + 4 + " is : " + powerR(x , n));
    }
    public static int powerR(int x, int n){
        if(n == 0){
            return 1;
        }else {
            return x * powerR(x , n-1);
        }
    }
}
