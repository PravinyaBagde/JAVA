public class OrderagnosticBS {
    public static void main(String[] args) {

        int arr[] = {12, 34, 56, 78, 89, 90, 104, 106};
        int target = 90;
        int ans = AgnosticBS(arr , target);
        System.out.println("The element is present at  : " + ans);
    }
    static int AgnosticBS(int[] array, int target){
        int start =  0;
        int end = array.length -1;

        boolean isASC = array[start] < array[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == array[mid]){
                return mid;
            }
            if(isASC){
                if(target < array[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                } }else{
                    if(target > array[mid]){
                        end = mid -1 ;
                    }else{
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
    }
