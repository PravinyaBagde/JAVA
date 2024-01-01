import java.util.Arrays;
public class Swap{
    public static void main(String[] args) {

        String[] name = {"Rohan", "Tanmay", "Khamba", "DevD"};
        Swap(name, 2, 0);
        System.out.println(Arrays.toString(name));
    }

        static void Swap(String[] name , int index1, int index2){
            String temp = name[index1];
            name[index1] = name[index2];
            name[index2] = temp;
        }
        }
