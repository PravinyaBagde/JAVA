import java.util.Scanner;
public class Results {
    public static void main(String[] args) {
        System.out.println("Enter your marks - ");
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();

            if(marks<50){
                System.out.println("fail");
            }
            else if(marks>=50 && marks<60){
                System.out.println("D grade");
            }
            else if(marks>=60 && marks<70){
                System.out.println("C grade");
            }
            else if(marks>=70 && marks<80){
                System.out.println("B grade");
            }
            else if(marks>=80 && marks<90){
                System.out.println("A grade");
            }else if(marks>=90 && marks<100){
                System.out.println("A+ grade");
            }else{
                System.out.println("Invalid!");
            }
        }
    }
