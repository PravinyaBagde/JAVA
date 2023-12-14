import java.awt.*;
import java.util.Scanner;
public class Fruits {
    public static void main(String[] args) {
        System.out.print("Enter the fruit of your choice - ");
Scanner in = new Scanner(System.in);
String Fruit = in.next();

        switch (Fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;

            case "Apple":
                System.out.println("A red looking sweet fruit.");
                break;

            case "Grapes":
                System.out.println("Small and sour fruit.");
                break;

            case "Watermelon":
                System.out.println("A big water fruit.");
                break;
            default:
                System.out.println("Not a fruit.");
        }
    }
}
