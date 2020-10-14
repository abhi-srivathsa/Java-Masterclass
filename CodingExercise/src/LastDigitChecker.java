public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
        int digitOne = 0, digitTwo = 0, digitThree = 0;
        if ( !isValid(numOne)|| !isValid(numTwo) || !isValid(numThree))
            return false;

        digitOne = numOne % 10;
        digitTwo = numTwo % 10;
        digitThree = numThree % 10;

        return digitOne == digitTwo || digitOne == digitThree || digitTwo == digitThree;


    }
    public static boolean isValid(int number) {
        if (number < 10 || number > 1000)
            return false;
        return true;
    }
}
