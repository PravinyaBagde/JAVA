public class StringRev {
    public static void main(String[] args) {
        String str = "abcd";
        stringReverse(str, str.length() - 1);
    }
    public static void stringReverse(String str, int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        stringReverse(str, index - 1);
    }
}