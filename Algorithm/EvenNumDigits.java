public class EvenNumDigits {
    public static void main(String[] args) {
        int[] numbers = {12, 345, 2, 6, 7896};
        System.out.println("The even number are : ");

        for (int number: numbers) {
            if(isEven(number)){
                System.out.println(number);
            }
        }
    }
    static boolean isEven(int numbers){
        int count = 0;

        while(numbers != 0) {
            numbers = numbers / 10;
            count++;
        }
        return count % 2 ==0;
    }
}