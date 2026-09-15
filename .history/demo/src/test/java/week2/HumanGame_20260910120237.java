package week2;

import java.util.*; // For Scanner, Random, etc.

/**
 * Number guessing game for humans.
 * 
 * Enter a seed number, and the computer will think of a number between 0 and
 * 99 that you have to guess in at most seven tries. Afterwards, you see your
 * guessing history so you can learn to better play the game.
 * 
 * @author Jose Andre Youssef Lopes
 * @id 2433753
 * @author Victor Vassilev Dichev
 * @id 2456486
 */
public class HumanGame {
    Scanner sc = new Scanner(System.in);
    Random randomGenerator;

    void run() {
        System.out.println("Type an arbitrary number");
        long seed = sc.nextLong();
        randomGenerator = new Random(seed);
        System.out.println("Start guessing!");
        int num = randomGenerator.nextInt(99);
        int guess = -1;
        final int maxGuesses = 7;
        Boolean won = false;
        List<Integer> guesses = new ArrayList<>();
        int numOfGuesses = 0;
        while (numOfGuesses < maxGuesses) {
            numOfGuesses++;
            guess = sc.nextInt();
            guesses.add(guess);
            if (guess > num) {
                System.out.println("lower");
            } else if (guess < num) {
                System.out.println("higher");
            } else {
                System.out.println("Good guess! You won.");
                won = true;
                break;
            }
        }
        System.out.println(!won ? "No more guesses, you lost" : "");
        System.out.println(numOfGuesses + " guesses:");
        for (int n : guesses) {
            for (int i = 0; i < 100; i++) {
                if (i == n) {
                    System.out.print("X");
                } else if (i == num) {
                    System.out.print("|");
                } else {
                    System.out.print(".");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new HumanGame().run();
    }
}
