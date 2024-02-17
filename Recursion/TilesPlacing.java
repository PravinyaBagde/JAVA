public class TilesPlacing {
    public static void main(String[] args) {
        int m = 4;
        int n = 2;
        int ans = placeTiles(m,n);
        System.out.println("Ans is : " + ans);
    }
    static int placeTiles(int m , int n){
        if(m == 0){
            return 1;
        }
        if(m < 0){
            return 0;
        }
        int Horizontal = placeTiles(m-1,n);
        int Vertical = placeTiles(m-n, n);

        return  Horizontal + Vertical;
    }
}
