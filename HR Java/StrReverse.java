import java.io.*;
import java.util.*;

public class StrReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String rev = "";

        int strLength = str.length();

        for (int i = strLength - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
