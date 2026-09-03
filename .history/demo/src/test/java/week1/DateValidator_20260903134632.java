package week1;
import java.util.Scanner;

public class DateValidator {
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
        boolean isValid = (year > 0) && (month >= 1 && month <= 12) && (day >= 1 && day <= maxDays);
        if (isValid)
            System.out.println(day + "/" + month + "/" + year + " is a valid date!");
        else
            System.out.println(day + "/" + month + "/" + year + " is not a valid date!");
        scanner.close();
    }
}
