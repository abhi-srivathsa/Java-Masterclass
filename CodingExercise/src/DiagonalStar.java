public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for(int i = 1; i<= number; i++){
            for(int j = 1; j<=number; j++){
                if(i == 1 || i == number) {
                    System.out.print("*");
                    if(j == number)
                        System.out.println();
                    continue;
                }
                if(j==1) {
                    System.out.print("*");
                    continue;
                }
                if(j==number) {
                    System.out.print("*");
                    System.out.println();
                    continue;
                }
                if(i==j) {
                    System.out.print("*");
                    continue;
                }
                if(j == (number - i + 1)) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }

        }
    }
}
