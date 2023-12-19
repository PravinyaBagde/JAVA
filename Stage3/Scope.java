public class  Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Pravinya";

        {
            a = 78;
            int c = 99;
             name = "Riya";
        }
        for (int i = 0; i < 4 ; i++) {
            System.out.println(i);
        }
        System.out.println(a);
    }
    }