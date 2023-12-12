import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("Enter the word  - ");
        Scanner ip = new Scanner(System.in);
        char ch = ip.next().charAt(0);

        if( ch >= 'a' && ch <= 'z'){
            System.out.println("The entered alphabet is LOWERCASE ." );
        }
        else if( ch >= 'A' && ch <= 'Z'){
            System.out.println("The entered alphabet is UPPERCASE .");
        }
else {
            System.out.println("The entered character is not an alphabet.");
        }
    }
}
