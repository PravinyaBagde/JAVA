public class MoveallXtoEnd {
    public static void main(String[] args) {
        String str = "abxxcxxdxe";
        char ch = 'x';
        moveALLX(str,0, 0, "");
    }
    public static void moveALLX(String str, int index, int count, String newStr){
        if(index == str.length()){
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char current = str.charAt(index);
        if(current == 'x'){
            count++;
            moveALLX(str,index+1,count,newStr);
        }else {
            newStr = newStr + current;
        moveALLX(str, index+1, count, newStr);
    }
}
}