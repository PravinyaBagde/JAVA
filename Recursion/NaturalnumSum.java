public class NaturalnumSum {
    public static void main(String[] args) {
        int n = 5;
        int sum = nSum(n);
        System.out.println("The sum of first natural number is : " + sum);
    }
    public static int nSum(int n){
        if(n == 0){
            return  0;
        }else {
            return n*(n+1)/2;
        }
    }
}