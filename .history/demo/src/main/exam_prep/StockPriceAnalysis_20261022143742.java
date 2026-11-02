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
        int[] changes = dailyChanges(prices);
        if (changes == null){}
            return;
        boolean isIncreasing = (changes[0] > 0) ? true : false;
        for (int i = 1; i < changes.length; i++) {
            if ((changes[i] > 0) != isIncreasing && changes[i] != 0) {
                System.out.println("Mixed");
                return;
            }
        }
        System.out.println((isIncreasing) ? "Increasing" : "Decreasing");
    }

    static int maxProfit(int[] prices) {
        int[] changes = dailyChanges(prices);
        int maxSum = 0;
        for (int i = 0; i < changes.length; i++) {
            int sum = changes[i];
            for (int j = i + 1; j < changes.length; j++) {
                sum += changes[j];
                maxSum = Math.max(maxSum, sum);
            }
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