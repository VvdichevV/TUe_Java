package week2;

import java.util.Scanner;

public class EgbertRescue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();

        StringBuilder initMessage = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = input.nextInt();
            initMessage.append((char) num);
        }
        String init
        System.out.println(initMessage);

        StringBuilder reversedBuilder = new StringBuilder();

        for (int i = 0; i < initMessage.length(); i += K) {

            int blockEnd = Math.min(i + K, initMessage.length());

            for (int j = blockEnd - 1; j >= i; j--) {
                reversedBuilder.append(initMessage.charAt(j));
            }
        }

        String reversedMessage = reversedBuilder.toString();
        System.out.println(reversedMessage);
    }
}
