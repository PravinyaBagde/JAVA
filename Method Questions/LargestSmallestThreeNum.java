import java.util.Scanner;
public class LargestSmallestThreeNum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the first number : ");
int first = ip.nextInt();
        System.out.print("Enter the first number : ");
        int second = ip.nextInt();
        System.out.print("Enter the first number : ");
        int third = ip.nextInt();

        int largest = findlargest(first,second,third);
        int smallest = findsmallest(first,second,third);

        System.out.println("Largest is : " + largest);
        System.out.print("Smallest is : " + smallest);

    }
    public static  int findlargest(int a, int b, int c){
    return Math.max(Math.max(a,b) , c);
    }
    public static int findsmallest(int a , int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
    }
