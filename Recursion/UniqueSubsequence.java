import java.util.HashSet;

public class UniqueSubsequence {
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSequence(str, 0,"",set);
    }
    static void subSequence(String str, int index, String newStr, HashSet<String>set){
         if(index == str.length()){
             if(set.contains(newStr)){
                 return;
             }else {
                 System.out.println(newStr);
                 set.add(newStr);
                 return;
             }
         }
         char current = str.charAt(index);
         subSequence(str, index+1, newStr+current,set);
         subSequence(str,index+1, newStr,set);
}
}

