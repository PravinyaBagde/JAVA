
import java.io.*;
        import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int y = 1;
        while (in.hasNext()) {
            String n = in.nextLine();
            System.out.println(y++ +" "+ n);
        }
        in.close();
    }
}
