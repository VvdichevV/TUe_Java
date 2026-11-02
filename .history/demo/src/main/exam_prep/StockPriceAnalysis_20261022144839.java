package exam_prep;

import java.util.Arrays;
import java.math.*;

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
        boolean allUp = true;
        boolean allDown = true;
        for (int c : dailyChanges(prices)) {
            if (c <= 0)
                allUp = false;
            if (c >= 0)
                allDown = false;
        }
        if (allUp) {
            System.out.println("Increasing");
        } else if (allDown) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Mixed");
        }
    }

    static int maxProfit(int[] prices) {
        int maxSum = 0;
        int sum = 0;
        for (int c : dailyChanges(prices)) {
            sum = Math.max(0, sum + c);
            
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(Arrays.toString(dailyChanges(prices)));
        System.out.println(isIncreasing(prices));
        printTrend(prices);
        System.out.println(maxProfit(prices));
    }

}