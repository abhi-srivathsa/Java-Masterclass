public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        int sum = 0;
        int lastDigit = 0;
        sum = sum + (number % 10);

        while (number > 0) {
            lastDigit = number % 10;
            number = number / 10;
        }
        sum = sum + lastDigit;
        return sum;
    }
}
