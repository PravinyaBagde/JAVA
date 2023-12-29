import javax.swing.*;
import java.util.Scanner;

public class SecondDArray {
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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
                
            }
            
        }
    
    }
