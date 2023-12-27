import java.sql.SQLOutput;
import java.util.Scanner;
public class ProductNum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = ip.nextInt();

        System.out.print("Enter the second number : ");
        int b = ip.nextInt();

        int isProduct = Product(a, b);
        System.out.print("The product of two num is : " + isProduct);
    }
      public static int Product( int a, int b){
        return a * b;
    }
}
