import java.util.Scanner;
public class DepreciationValue {
    public static void main(String[] args) {

        System.out.print("Enter the name of your asset : ");
        Scanner iop = new Scanner(System.in);
        String Name = iop.next();

        System.out.print("Enter the cost of your assests : ");
        Scanner ip = new Scanner(System.in);
        double CostofAssests = ip.nextDouble();

        System.out.print("Enter the residual value : ");
        Scanner op = new Scanner(System.in);
        double ResidualValue = op.nextDouble();

        System.out.print("Enter the service years expectations  : ");
        Scanner ipo = new Scanner(System.in);
        double UsefulLife = ip.nextDouble();

        double DepreciationValue = ( CostofAssests - ResidualValue) / UsefulLife;
        System.out.print("The Annual Depreciation Value of Your " + Name + " Asset is : $"+DepreciationValue);
    }
}
