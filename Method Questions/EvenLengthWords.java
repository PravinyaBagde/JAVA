public class EvenLengthWords {
    public static void main(String[] args) {
        String str = " Sky is vast and blue";
        printEven(str);
    }
    public static void printEven(String str){
        String[] words = str.split(" ");

        System.out.println("Even length of words are : " );
        for (String word : words){
            if(word.length() % 2 == 0){
                System.out.println(word);
            }
        }
    }
}
