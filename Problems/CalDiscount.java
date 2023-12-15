import java.util.Scanner;
public class CalDiscount {
    public static void main(String[] args) {
        System.out.print("Enter the original price : ");
        Scanner ip = new Scanner(System.in);
        double OgPrice = ip.nextDouble();

        System.out.print("Enter the benefit discount : ");
        double Discount = ip.nextDouble();

        double DiscountPercentage = Discount / 100;
        double NewPrice = OgPrice - (OgPrice * DiscountPercentage);

        System.out.println("Your price for the new product will be : " + NewPrice);
    }
}