import java.util.Scanner;
public class PrimeorNot {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = ip.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.print("Not a Prime Number !!!");
        }
    }
        public static boolean isPrime(int num){
           if (num <= 1){
               return false;
           }
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

