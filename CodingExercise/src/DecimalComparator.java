public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        long newNumberOne = (long) (numberOne * 1000);
        long newNumberTwo = (long) (numberTwo * 1000);
        if (newNumberOne == newNumberTwo)
            return true;
        return false;
    }
}
