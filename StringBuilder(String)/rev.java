public class rev {
    public static void main(String[] args) {
        String str = "Pravinya";
        String ans = rev(str);
        System.out.println(ans);
    }
    public static String rev(String str){
        StringBuilder Reversed = new StringBuilder();
        for (int i = str.length()-1; i >= 0 ; i--) {
            Reversed.append(str.charAt(i));
        }
        return Reversed.toString();
    }
}
