import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //  greeting();
        // static void greeting(){
        //   System.out.println("Hello World !!!");
        System.out.print("Enter your name : ");
        Scanner ip = new Scanner(System.in);
        String name  = ip.next();

        String personalisedMesaage = myGreet(name);
        System.out.println(personalisedMesaage);
    }

    static String myGreet(String name){
        String message = "Jai Bhim " + name;
        return message;
    }
}
