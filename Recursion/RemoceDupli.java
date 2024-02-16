public class RemoceDupli {
    public static void main(String[] args) {
        String str ="praavinyyass";
        remoceDupli(str, 0, "");
    }
    public static boolean map[] = new boolean[26];

    public static void remoceDupli(String str, int index, String newStr){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }


        char current = str.charAt(index);
        if(!map[current - 'a']){
            newStr += current;
            map[current - 'a'] = true;
        }
        remoceDupli(str,index+1,newStr);
    }
}