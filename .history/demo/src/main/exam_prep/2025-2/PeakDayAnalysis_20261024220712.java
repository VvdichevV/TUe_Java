import java.util.*;
import java.math.*;

public class PeakDayAnalysis {
    public static void main(String[] args) {
        int[] visitors = { 100, 180, 150, 200, 210, 90, 120 };
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
        int currentStreak = 0;
        int longestStreak = 0;
        boolean active = false;
        for (int i = 1; i < peakDays.length - 1; i++) {
            if (active) {

            }
            if (peakDays[i]) {
                if(active)
            }

        }
        return longestStreak;
    }
}
