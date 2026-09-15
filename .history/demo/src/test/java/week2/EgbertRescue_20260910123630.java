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
        System.out.println(initMessage);
    }
}
