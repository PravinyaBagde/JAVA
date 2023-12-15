import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
  Scanner op = new Scanner(System.in);
  int num = op.nextInt();

   if( num < 0){
       System.out.println("INVALID NUMBER !!!");
       return ;
   }
        double sum = 0;
        System.out.println("Enter the elements : ");
        for (int i = 0; i < num; i++) {
            int numbers = op.nextInt();
            sum = sum + numbers;
        }
        double Average = sum  / num;
        System.out.print("The Average of Entered Numbers is : " + Average);

    }
}