import java.util.Scanner;
public class Eligibility {
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
    Scanner ip = new Scanner(System.in);
    int age = ip.nextInt();

    if(isEligible(age)){
        System.out.println("You are eligible to vote !!!");
    }
    else {
        System.out.print("You are not eligible to vote !!!");
    }
}
public static boolean isEligible(int age){
    return age >= 18;
    }
}
