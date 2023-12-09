import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args) {
        
        System.out.print("Enter the string - ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String result = "";
        for ( int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        System.out.print("The reversed string is  - " + result);
    }

}