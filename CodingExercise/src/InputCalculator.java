import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int number;
        int counter = 0;

        while(true){
            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                number = scanner.nextInt();
                sum += number;
                counter++;
                average = (double) sum /counter;
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
    }
}
