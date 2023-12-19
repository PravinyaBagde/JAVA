public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Pravinya Bagde";
        changeName(name);
        System.out.println(name);
    }
     static void changeName(String naam){
        naam = "Rahul Rana";
    }
  static void swap(int a, int b) {
      int temp = a;
      a = b;
      b = temp;

  }
        }
