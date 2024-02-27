public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 2, 5};
        int[] bobSizes = {2, 4};
        int[] res = candySwap(aliceSizes, bobSizes);
        System.out.println("Fair Candy Swap: [" + res[0] + ", " + res[1] + "]");
    }
    public static int[] candySwap(int[]aliceSizes, int[]bobsizes){
        int sumA = 0;
        int sumB = 0;

        for (int size : aliceSizes) {
            sumA += size;
        }
        for (int size : bobsizes) {
            sumB += size;
        }
        int n = aliceSizes.length;
        int m = bobsizes.length;

        for (int i = n-1; i >= 0 ; i--){
            for (int j = m-1; j >= 0 ; j--){
                int difference = aliceSizes[i] - bobsizes[j];
                if(sumA - difference == sumB + difference){
                    return new int[] {aliceSizes[i] , bobsizes[j]};
                }
            }
        }
        return new int[]{0, 0};
    }
}
