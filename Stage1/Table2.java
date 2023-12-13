import java.util.Scanner;
public class Table2 {
    public static void main(String[] args) {
        System.out.print("Enter the choice - ");

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for(int i = 1; i <= 10; i++){
            int res = N * i;
            System.out.println(N + " * " + i + " = " + res);
        }
    }
}

  //Using "For - Loop"
