import java.util.*;
import java.math.*;

public class PeakDayAnalysis {
    public static void main(String[] args) {
        int[] visitors = { 40, 160, 150, 140, 130, 170, 120 };
        System.out.println(Arrays.toString(findPeakDays(visitors)));
        System.out.println(longestIncreaisngPeakInterval(visitors));
    }

    public static boolean[] findPeakDays(int[] visitors) {
        boolean[] peakDays = new boolean[visitors.length];
        for (int i = 1; i < visitors.length - 1; i++) {
            if (visitors[i - 1] < visitors[i] && visitors[i + 1] < visitors[i]) {
                peakDays[i] = true;
            }
        }
        return peakDays;
    }

    public static int longestIncreaisngPeakInterval(int[] visitors) {
        boolean[] peakDays = findPeakDays(visitors);
        int prev = -1;
        int best = 0;
    }
}
