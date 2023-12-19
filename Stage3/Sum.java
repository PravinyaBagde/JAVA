import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    static int sum2(){
        System.out.print("Enter the value of num1 : ");
        Scanner ip = new Scanner(System.in);
        int num1 = ip.nextInt();

        System.out.print("Enter the value of num2 : ");
        Scanner op = new Scanner(System.in);
        int num2 = op.nextInt();

        int sum = num1 + num2;
        return sum;

        //System.out.print("The sum of two numbers is : " +sum );
    }
}

