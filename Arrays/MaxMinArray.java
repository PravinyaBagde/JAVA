import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();

      int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = ip.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if(number[i] < min){
                min = number[i];
            }
            if (number[i] > max){
                max = number[i];
            }
        }
        System.out.println("The largest number is : " + max);
        System.out.print("The smallest number is : " + min);
        }

        }


