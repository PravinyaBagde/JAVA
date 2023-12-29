/* Take an array of names as inout from the user and
   print them on the screen
 */

import java.util.Scanner;
    public class NameArrays {
        public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);

            int size = ip.nextInt();

            String name[] = new String[size];
            for (int i = 0; i < size; i++) {
                name[i] = ip.next();
               // System.out.println(name[i]);
            }
            for (int i = 0; i < name.length; i++) {
                System.out.println("Name " + (i+1) + " is : " + name[i]);

            }
        }
    }



