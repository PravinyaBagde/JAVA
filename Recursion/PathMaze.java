public class PathMaze {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int ans = pathMaze(m,n);
        System.out.println("Total paths are : " + ans);
    }
    public static int pathMaze(int m , int n){
        if(m==1 || n==1){
            return 1;
        }
        int rightPath = pathMaze(m,n - 1);
        int downPath = pathMaze(m - 1,n);
        return rightPath + downPath;
    }
}