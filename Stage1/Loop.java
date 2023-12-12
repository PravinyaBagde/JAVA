import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        System.out.println("Enter the number - ");
        Scanner ip = new Scanner(System.in);
        int naw = ip.nextInt();

        int num =1;
        while(num <= naw){
            System.out.println(num);
            num = num +1;
        }
    }
}