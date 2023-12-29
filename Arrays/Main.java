/*Take an array as input from the user . Search for a given
  number 'x' and print the index at which it occurs */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int siq = ip.nextInt();
        //Define an array
        int number[] = new int[siq];

        //Taking input of an array elements
        for (int i = 0; i < siq; i++) {
            number[i] = ip.nextInt();
        }
        //The element needed to find
        int y = ip.nextInt();

        //Output
        for (int i = 0; i < number.length; i++) {
            if (number[i] == y ){
                System.out.print("y is found at the following index : " + i);
            }

        }


        }
    }