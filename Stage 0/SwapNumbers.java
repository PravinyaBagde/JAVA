public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 21;
        System.out.println("Before swap a = " + a );
        System.out.println("Before swap b = " + b );

        int temp = a;;
        a = b;
        b = temp;
        System.out.println("After swapping a = " + a);
        System.out.println("After swapping b = " + b);
    }
}
