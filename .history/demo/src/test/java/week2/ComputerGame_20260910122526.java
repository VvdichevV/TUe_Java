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
public class ComputerGame {
    Scanner sc = new Scanner(System.in);
    Random randomGenerator;

    void run() {
        System.out.println(
                "Think of a secret number not smaller than 0 and not tgreater than 999. Type 'go' when you have one.");
        String go = sc.next();
        int maxGuesses = 10;
        int numOfGuesses = 0;
        int left = 0;
        int right = 999;
        Boolean found;
        while (numOfGuesses < maxGuesses && left <= right) {
            numOfGuesses++;
            int guess = (left + right) / 2;
            System.out.println(guess);
            go = sc.next();
            if (go.equals("lower")) {
                right = guess + 1;
            } else if (go.equals("higher")) {
                left = guess - 1;
            } else if (go.equals("guessed")) {
                found=true;
                break;
            }
        }
        System.out.println(found ? "I give up" : "");
    }

    public static void main(String[] args) {
        new ComputerGame().run();
    }
}
