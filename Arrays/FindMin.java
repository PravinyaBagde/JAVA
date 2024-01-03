class FindMin{
    public static void main(String[] args) {
        int arr[] = {18, 12, -7, 3, 14, 28};
        int quala = Minimum(arr);
        System.out.println(quala);
    }
    static int Minimum(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
        }
    }
