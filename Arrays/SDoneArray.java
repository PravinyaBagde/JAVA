import javax.swing.*;
import java.util.Scanner;

public class SDoneArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int rows = ip.nextInt();
        int columns = ip.nextInt();

        int [] [] numbers = new int[rows][columns];
        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = ip.nextInt();

            }

        }
        int x = ip.nextInt();

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(numbers[i][j] == x){
                    System.out.print("x found at location " + i + " " + j + " ");
                }
            }
            System.out.println();

        }

    }

}
