import java.util.Scanner;

public class SearchX {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int rows = ip.nextInt();
        int cols = ip.nextInt();

        int [] [] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = ip.nextInt();
            }
        }
        int x = ip.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(numbers[i][j] == x){
                    System.out.print("X is found at : " + i + " , "+ j);
                }
            }

        }
    }
}
