import java.util.Scanner;

public class FileValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println(day + "/" + month + "/" + year);
        Boolean isLeap = ()(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        scanner.close();
    }
}
