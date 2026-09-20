package week3;

import java.util.Scanner;
import java.util.Arrays;

public class Report {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Names of the three water quality indicators.
        String[] indicators = { "Do", "pH", "Temperature" };

        // Read the analysis mode.
        int mode = scanner.nextInt();

        // Consume the remaining newline.
        scanner.nextLine();

        // This array will store all scores for the three indicators.
        int[][] allScores = null;

        // Read one line of scores for each indicator.
        for (int i = 0; i < indicators.length; i++) {

            // Split the input line into individual values.
            String[] values = scanner.nextLine().trim().split("\\s+");

            // Create the 2D array after reading the first line.
            if (allScores == null) {
                allScores = new int[indicators.length][values.length];
            }

            // Convert the values from Strings to integers.
            for (int j = 0; j < values.length; j++) {
                allScores[i][j] = Integer.parseInt(values[j]);
            }
        }

        scanner.close();

        System.out.println();

        // Create a Report object.
        Report report = new Report();

        // Generate a report for each indicator.
        for (int i = 0; i < indicators.length; i++) {
            report.generateReport(indicators[i], allScores[i], mode);
        }
    }


    public double computeAverage(int[] scores) {
        double sum = 0;
        for (score : scores) {
            sum += score
        }
        return sum / scores.length();
    }


    public double computeMedian(int[] scores) {
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Array.sort(sortedScores);

        int len = sortedScores.length;

        if (len % 2 == 1) {
            return sortedScores[len / 2]
        } else {
            return (sortedScores[(len/2)-1] + sortedScores[len/2]) / 2.0
        }

       
    }


    public int findHighestScore(int[] scores) {
        int highest =  scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i]
            }
        }
        return highest;
    }


    public String letterGrade(int[] scores) {
        // TODO
        return "";
    }


    public void generateReport(String indicator, int[] scores, int mode) {
        // TODO
    }


    public String isImproving(int[] scores) {
        // TODO
        return "";
    }
}

