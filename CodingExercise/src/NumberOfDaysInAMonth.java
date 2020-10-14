public class NumberOfDaysInAMonth {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999)
            return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
    }

    public static int getDaysInAMonth (int year, int month) {
        if (year < 1 || year > 9999 || month < 1 || month > 12)
            return -1;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(isLeapYear(year))
                    return 29;
                return 28;
            default:
                return -1;
        }
    }
}
