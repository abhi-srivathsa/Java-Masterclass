    public class NumberPalindrome {
        public static boolean isPalindrome(int number) {
            if (number < 0) {
                number = -number;
            }
            int originalNumber = number;
            int palindrome = 0;
            while (number > 0) {
                palindrome = (palindrome * 10) + number % 10;
                number = number / 10;
            }
            return palindrome == originalNumber;
        }
    }
