import java.util.Scanner;

public class FileValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println(day + "/" + month + "/" + year);
        Boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int maxDays;
        switch (month) {
            case 1, 3, 5 ,7, 8, 10, 12 : case 3: case 5: case 7: case 8: case 10: case 12:
                maxDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = isLeap ? 29 : 28;
                break;
            default:
                maxDays = 0;
                break;
        }
        scanner.close();
    }
}
