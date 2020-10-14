public class NumberToWords {
    public static int getDigitCount(int number) {
        int digit = 0;
        if (number < 0)
            return -1;
        if (number == 0)
            return 1;
        while (number > 0) {
            number = number / 10;
            digit++;
        }
        return digit;
    }

    public static int reverse(int number) {
        int negative = 0;
        if (number < 0) {
            number = -number;
            negative = 1;
        }
        int newNumber = 0;
        while (number > 0) {
            newNumber += (number % 10);
            newNumber = newNumber * 10;
            number = number / 10;
        }
        newNumber /= 10;
        if (negative == 1)
            return -newNumber;
        return newNumber;
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");
        else {
            int originalDigit = getDigitCount(number);
            int reversedNumber = reverse(number);
            int reversedDigit = getDigitCount(reversedNumber);

            int digit;
            while (reversedNumber > 0) {
                digit = reversedNumber % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("unknown");
                }
                reversedNumber = reversedNumber / 10;
            }
            while (reversedDigit < originalDigit) {
                System.out.println("Zero");
                reversedDigit++;
            }

            if (number == 0)
                System.out.println("Zero");

        }
    }

}
