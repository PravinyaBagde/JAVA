public class Stringbuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

         //char at index
        System.out.println(sb.charAt(2));

        sb.setCharAt(0, 'P');
        System.out.println(sb);

        sb.insert(0,'A');
        System.out.println(sb);
    }
}
