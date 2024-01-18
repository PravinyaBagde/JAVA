public  class MinElement {
    public static void main(String[] args) {

        int []arr = { 12, 54, 65, 33, 21, 32, 34};
        int ans = Mini(arr);
        System.out.println("The minimum element is : " + ans);
    }
    public static int Mini(int[]jar){
        int min = jar[0];
        for (int i = 0; i < jar.length; i++) {
            if(jar[i] < min){
                min = jar[i];
            }
        }
        return  min;
    }
}