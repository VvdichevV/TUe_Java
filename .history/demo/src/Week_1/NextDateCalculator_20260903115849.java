import java.util.Scanner;

public class NextDateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        Boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int maxDays;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                maxDays = 31;
                break;
            case 4, 6, 9, 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = isLeap ? 29 : 28;
                break;
            default:
                maxDays = 0;
                break;
        }
        if (day < maxDays) {
            day++;
        }else if(day == maxDays){
            day = 1;
            
        }
        scanner.close();
    }
}
