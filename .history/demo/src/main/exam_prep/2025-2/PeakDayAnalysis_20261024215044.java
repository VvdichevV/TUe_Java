import java.util.*;

public class PeakDayAnalysis {
    public static void main(String[] args) {
        int[] visitors = { 100, 180, 180, 170, 210, 220, 230 };
        System.out.println(Arrays.toString(findPeakDays(visitors)));
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
        for (int i = 1; i < peakDays.length - 1; i++) {
            if (currentStreak > 0 && visitors[i] < visitors[i + 1]) {

            }
            if (peakDays[i] == true) {
                currentStreak = (currentStreak == 0) : ;
            }

        }
    }
}
