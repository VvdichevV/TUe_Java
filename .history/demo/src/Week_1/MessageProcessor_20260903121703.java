import java.util.Scanner;

public class MessageProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mode = scanner.nextInt();
        String message = scanner.next();

        switch (mode) {
            case 1:
                System.out.println("Hello + %s", message);
                break;
            case 2:
                System.out.println((message.contains("ss") ? "Contains double s" : "Does not contain double s"));
                break;
            case 3:
                
            default:
                break;
        }
    }
}
