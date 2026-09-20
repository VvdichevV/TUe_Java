package week3;

import java.util.Scanner;

/**
 * Universal Automaton.
 * 
 * @author Jose Andre Youssef Lopes
 * @id 2433753
 * @author Victor Vassilev Dichev
 * @id 2456486
 */
class ABAutomaton {
    Scanner scanner = new Scanner(System.in);

    String genToString(boolean[] gen) {
        // TODO Implementation
        return "Hello";
    }

    boolean[] nextGenA(boolean[] gen) {
        // TODO Implementation
        return new boolean[] { true, false };
    }

    boolean[] nextGenB(boolean[] gen) {
        // TODO Implementation
        return new boolean[] { true, false };
    }

    boolean[] readInitalGeneration(int length) {
        boolean[] initGen = new boolean[length];
        String token = scanner.next();
        if (token.equals("init_start")) {
            token = scanner.next();
            initGen[token]
        }

    }

    void run() {
        // Read input to configure the automaton
        String automaton = scanner.next();
        int genLength = scanner.nextInt();
        int numOfGens = scanner.nextInt();
        boolean[] initGen = readInitalGeneration(genLength);

        // Run the automaton
        boolean[] gen = initGen;

        for (int i = 0; i < numOfGens; i++) {
            // Display the current generation
            System.out.println(genToString(gen));

            // And determine the next generation
            if ("A".equals(automaton)) {
                gen = nextGenA(gen);
            } else {
                // B
                gen = nextGenB(gen);
            }
        }
    }

    public static void main(String[] args) {
        new ABAutomaton().run();
    }
}
