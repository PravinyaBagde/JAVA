import java.util.Arrays;
public class VariableArguments {
    public static void main(String[] args) {
       fun();
       multiple(2,3,"Pravinya" + "Priya");
    }

    static  void multiple(int a , int b , String...v){

    }


    static void fun(int ...v)   // The (int ...v) will take it as a array of integers.
    {
        System.out.print(Arrays.toString(v));
    }
}
