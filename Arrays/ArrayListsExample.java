import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsExample{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        ArrayList<String>theArrayList = new ArrayList<>();

        theArrayList.add("Nayan");
        theArrayList.add("Piyush");
        theArrayList.add("Riya");

        System.out.println(theArrayList);

        //It will remove the "PIYUSH" string 
        theArrayList.remove("Piyush");

        //Checking whether the following element is present in it.
        System.out.println(theArrayList.contains("Riya"));
        System.out.println("The updated arayList is : " + theArrayList);
    }
}