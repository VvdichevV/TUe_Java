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
class UniversalAutomaton {
    Scanner scanner = new Scanner(System.in);

    String genToString(boolean[] gen) {
        StringBuilder generation = new StringBuilder();
        for (boolean cell : gen) {
            generation.append(cell ? "*" : ' ');
        }

        return generation.toString();
    }

    boolean[] nextGen(boolean[] ruleSequence, boolean[] gen) {
        // TODO Implementation
        return new boolean[] { true, false };
    }

    boolean[] readInitalGeneration(int length) {
        boolean[] initGen = new boolean[length];
        scanner.next();
        while (true) {
            String token = scanner.next();
            if (token.equals("init_end")) {
                break;
            } else {
                int pos = Integer.parseInt(token) - 1;
                initGen[pos] = true;
            }
        }
        return initGen;
    }

    boolean[] readRuleSequence() {
        
        return new boolean[] { true, false };
    }

    void run() {
        // Read input to configure the universal automaton
        boolean[] ruleSequence = readRuleSequence();
        int generationLength = scanner.nextInt();
        int numberOfGenerations = scanner.nextInt();
        boolean[] initGen = readInitalGeneration(generationLength);

        // Run the automaton
        boolean[] gen = initGen;

        for (int i = 0; i < numberOfGenerations; i++) {
            // Display the current generation
            System.out.println(genToString(gen));
            // Determine the next generation
            gen = nextGen(ruleSequence, gen);
        }
    }

    public static void main(String[] args) {
        new UniversalAutomaton().run();
    }
}
