public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Pravinya";
        char ch = 'a';
        boolean ans = Search(name, ch);
        System.out.println("The character " + ch + " existence is " + ans);
    }
    static boolean Search(String str, char ch) {
            if (str.length() == ch) {
                return false;
            }
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    return true;
                }
            }
            return false;
        }
    }