public class PresentElement {
    public static void main(String[] args) {

        int[] arr = {12, 34, 56, 67, 45, 23};
        int key = 34;

        boolean ans = presentElement(arr, key);
        if (ans) {
            System.out.println("The element exists.");
        } else {
            System.out.println("The element does not exists.");
        }
    }

    public static boolean presentElement(int[] jar, int key) {
        for (int i = 0; i < jar.length; i++) {
            if (jar[i] == key) {
                return true;
            }
        }
        return false;
    }
}

