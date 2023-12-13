import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        System.out.print("Enter the number - ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();


        int i = 1;
        while (i <= 10) {

            int res = N * i;
            System.out.println(N + " * " + i + " = " + res);
            i++;
        }
    }
}

//Using "While-loop" 