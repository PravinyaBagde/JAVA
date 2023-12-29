public class ApproachSorting {
    public static void main(String[] args) {
      int arr[] = new int[] {4,5,2,3,8};
      int temp = 0;

        for (int i = 0; i < args.length; i++) {
            System.out.print(arr[i] + " ");

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println();
        System.out.print("Array after sorting in ascending : " );
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + " ");

            }
            }
}


