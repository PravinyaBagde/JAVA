public class PyramidNumPattern {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num ; i++) {

            for (int j = 1; j <= num - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print(k);

            }
            for (int l = i - 1; l >= 1 ; l--) {
                System.out.print(l);

            }
            System.out.println();
            }

        }
    }

