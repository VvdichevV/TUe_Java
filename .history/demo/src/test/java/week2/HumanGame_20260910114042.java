package week2;

import java.util.*; // For Scanner, Random, etc.

/* Name1: Jose Andre Youssef Lopes | Student Number: 2433753

Name2: Victor Vassilev Dichev | Student Number: 2456486

*/
public class HumanGame {
    Scanner sc = new Scanner(System.in);
    Random randomGenerator;

    void run() {
        System.out.println("Type an arbitrary number");
        long seed = sc.nextLong();
        randomGenerator = new Random(seed);
        System.out.println("Start guessing!");
        int num = randomGenerator.nextInt


    }

    public static void main(String[] args) {
        new HumanGame().run();
    }
}
