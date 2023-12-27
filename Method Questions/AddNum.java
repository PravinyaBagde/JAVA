import java.util.Scanner;
public class AddNum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int num1 = ip.nextInt();

        System.out.print("Enter the second value :");
        int num2 = ip.nextInt();

        int Addition = NumAdd(num1 , num2);

        System.out.print("The addition of two numbers is : " + Addition);
    }
public static int NumAdd(int a, int b) {
    return a + b;
}
}
