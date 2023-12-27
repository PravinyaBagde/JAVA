public class PalindromeTriangle {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <=n ; i++) {
            //Loop to print the spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //loop  for the first half
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }
            //loop for the second half
            for (int j = 2; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }}
}



