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

        StringBuilder reversedBuilder = new StringBuilder();

        for (int i = 0; i < initMessage.length(); i += k) {

            int blockEnd = Math.min(i + k, initMessage.length());

            for (int j = blockEnd - 1; j >= i; j--) {
                reversedBuilder.append(initMessage.charAt(j));
            }
        }

        String reversedMessage = reversedBuilder.toString();
        System.out.println(reversedMessage);
    }
}
