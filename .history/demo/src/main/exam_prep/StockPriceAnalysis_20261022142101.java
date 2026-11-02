package exam_prep;

import java.util.Arrays;

public class StockPriceAnalysis {
    static int[] dailyChanges(int[] prices) {
        int[] changes = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            changes[i - 1] = prices[i] - prices[i - 1];
        }
        return changes;
    }

    static boolean isIncreasing(int[] prices) {
        int[] changes = dailyChanges(prices);
        for (int i = 0; i < changes.length; i++) {
            if (changes[i] < 0) {
                return false;
            }
        }
        return true;
    }

    static void printTrend(int[] prices) {
        int[] changes = dailyChanges(prices);
        boolean direction = (changes[0] > 0) ? 1 : -1;
        for (int i = 1; i < changes.length; i++) {
            if (changes[i] != direction) {
                System.out.println("Mixed");
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] prices = { 100, 102, 101, 105 };
        System.out.println(Arrays.toString(dailyChanges(prices)));
        System.out.println(isIncreasing(prices));
    }

}