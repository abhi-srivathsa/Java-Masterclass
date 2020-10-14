public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;
        int greatest = 0;
        int flag;
        for (int i = 2; i <= number; i++) {
            flag = 1;
            if (number % i == 0) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0)
                        flag = 0;
                }
                if (flag == 1)
                    if (i > greatest)
                        greatest = i;
            }
        }
        return greatest;
    }
}



