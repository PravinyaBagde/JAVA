import java.util.Scanner;

import java.util.Scanner;
public class MaxofThree {
    public static void main(String[] args) {
        System.out.print("Enter the first number - ");
        Scanner ip = new Scanner(System.in);
        int A = ip.nextInt();

        System.out.print("Enter the second number - ");
        Scanner input = new Scanner(System.in);
        int B = input.nextInt();

        System.out.print("Enter the third number - ");
        Scanner apex = new Scanner(System.in);
        int C = apex.nextInt();

        if (A>B && A>C){
            System.out.println(A + " IS THE MAXIMUM NUMBER.");
        }
        else if (B>C && B>A) {
            System.out.println(B + " IS THE MAXIMUM NUMBER.");
        }
            else if (C>A && C>B){
                System.out.println(C + " IS THE MAXIMUM NUMBER.");
            }
            else{
            System.out.println("CHECK THE NUMBERS AGAIN AND RETRY.");
        }
    }
}

