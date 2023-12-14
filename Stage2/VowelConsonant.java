import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        System.out.print("Enter the character :  ");
        Scanner ip = new Scanner(System.in);
        char ch = ip.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The entered alphabet is an Vowel.");
                break;
            default:
                System.out.println("The entered alphabet is an Consonant.");
        }
    }
}