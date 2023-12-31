import java.util.Scanner;

public class IntReverse {
    public static void main(String[] args) {
        System.out.print("Enter your integer : ");
        Scanner ip =  new Scanner(System.in);

        int x = ip.nextInt();
        int  rev = 0;
        while ( x != 0){
            int digit = x % 10;
            if( rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                System.out.print("OverFlow");
                return ;
            }
            rev = rev*10 + digit;
            x = x/10;
        }
        System.out.print("The reversed intgere is : " + rev);
    }
}
