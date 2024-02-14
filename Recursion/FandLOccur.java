public class FandLOccur {
    public static void main(String[] args) {
        String str = "abracadabrakkajah";
        char ch = 'a';
        getIndices(str, ch, 0);

        if (first != -1) {
            System.out.println("First occurrence is : " + first);
        }
        if (last != -1) {
            System.out.println("Last occurrence is : " + last);
        }
    }

    public static int first = -1;
    public static int last = -1;

    public static void getIndices(String str, char ch, int index) {
        if (index == str.length()) {
            return;
        }
        if (str.charAt(index) == ch) {
            if (first == -1) {
                first = index;
            }
                last = index;
            }
            getIndices(str, ch, index + 1);
        }
    }