public class StringSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str,0,"");
    }
    static void subsequences(String str, int index, String current){
        if(index == str.length()){
            System.out.println(current);
            return;
        }
        subsequences(str, index+1,current+ str.charAt(index));
        subsequences(str, index+1, current);
    }
}