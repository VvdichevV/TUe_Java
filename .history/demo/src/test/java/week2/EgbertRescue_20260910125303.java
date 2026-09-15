package week2;

import java.util.Scanner;

public class EgbertRescue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        String initMessage = "";
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            initMessage += ((char) num);
        }
        System.out.println(initMessage);

        String reversedMessage = "";

        for (int i = 0; i < initMessage.length(); i += k) {
            for (int j = (i + k) - 1; j >= i; j--) {
                reversedMessage += (initMessage.charAt(j));
            }
        }

        System.out.println(reversedMessage);

        String purgedMessage = "";
        for (int i = 0; i < reversedMessage.length() - 1; i++) {
            if (reversedMessage.charAt(i + 1).equals"*") {
            }
        }
    }
}
