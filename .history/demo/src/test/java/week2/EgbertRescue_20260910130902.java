package week2;

import java.util.Scanner;

public class EgbertRescue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        StringBuilder initMessage = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            initMessage.append((char) num);
        }
        System.out.println(initMessage);

        StringBuilder reversedMessage = new StringBuilder();
        for (int i = 0; i < initMessage.length(); i += k) {
            int blockEnd = Math.min(i + k, initMessage.length());
            for (int j = blockEnd - 1; j >= i; j--) {
                reversedMessage.append(initMessage.charAt(j));
            }
        }
        System.out.println(reversedMessage);

        StringBuilder purgedMessage = new StringBuilder();
        for (int i = 0; i < reversedMessage.length(); i++) {
            char ch = reversedMessage.charAt(i);
            if (reversedMessage.charAt(i) == "*" && purgedMessage) {
                if (purgedMessage.length() > 0) {
                    purgedMessage.deleteCharAt(purgedMessage.length() - 1);
                }
            } else {
                purgedMessage.append(ch);
            }
        }
        System.out.println(purgedMessage);

        input.close();
    }
}
