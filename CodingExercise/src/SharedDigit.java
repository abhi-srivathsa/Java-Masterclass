public class SharedDigit {
    public static boolean hasSharedDigit (int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99 )
            return false;
         int digitOneOne = num1 % 10;
         int digitOneTwo = num1 / 10;
         int digitTwoOne = num2 % 10;
         int digitTwoTwo = num2 / 10;

         if (digitOneOne == digitTwoOne || digitOneOne == digitTwoTwo || digitOneTwo == digitTwoOne || digitOneTwo == digitTwoTwo)
            return true;
         return false;
    }
}
