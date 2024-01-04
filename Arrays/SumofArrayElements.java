import java.util.Scanner;

public class New{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
          arr[i] = ip.nextInt();
        }
        int res = SumofElements(arr);
        System.out.println("Sum of array elements is  :" + res);
        }
        public static int SumofElements(int []arr){
        int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];

            }
return  sum;
    }
}