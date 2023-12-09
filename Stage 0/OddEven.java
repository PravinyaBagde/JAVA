//Write a program that determines whether a given number is even or odd.

import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        System.out.println("Enter the number of your choice - ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 1) {
            System.out.println(num + " is an odd number.");
        } else {
            System.out.println(num + " is an even number.");
        }
    }
    }