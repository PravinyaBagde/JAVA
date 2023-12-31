import java.util.Scanner;

public class LenofLastWord {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String s = ip.nextLine();

        int len = 0;
        s = s.trim();

        for (int i = s.length()-1; i >= 0 ; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                len++;
            }
        }
            System.out.print("The length of your string is : " + len);
        }
    }

