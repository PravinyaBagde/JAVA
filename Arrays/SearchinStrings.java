class SearchinStrings{
    public static void main(String[] args) {

        String name = "Abhishekh";
        char target = 'v';

        boolean res = search(name , target);
        System.out.println(res);
    }

static boolean search(String name , char target){
    if(name.length() == 0){
        return  false;
    }
    for (int i = 0; i < name.length(); i++) {
        if (target == name.charAt(i)) {
            return true;
        }
    }
    return false;
    }
}