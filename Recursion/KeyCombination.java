public class KeyCombination {
    public static void main(String[] args) {
        String str = "4";
        printCombo(str, 0, "");
    }
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombo(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
        char current = str.charAt(index);
        String mapping = keypad[current - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombo(str, index+1, combination+mapping.charAt(i));
        }
    }
}
