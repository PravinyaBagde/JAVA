public class RecursiveFactorial {
    public static void main(String[] args) {
        int n = 7;
        int ans = rFact(n);
        System.out.println("The factorial of " + n + " is : " + ans);
    }
    static int rFact(int n){
        if(n == 0){
            return 1;
        }else {
            return n * (rFact(n - 1 ));
        }
    }
}