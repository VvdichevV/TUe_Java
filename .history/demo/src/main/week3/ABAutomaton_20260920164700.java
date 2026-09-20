package week3;

import java.util.Scanner;

/**
 * Automatons 
 * 
 * @author Jose Andre Youssef Lopes
 * @id 2433753
 * @author Victor Vassilev Dichev
 * @id 2456486
 */
class ABAutomaton {
    Scanner scanner = new Scanner(System.in);

    String genToString(boolean[] gen) {
        StringBuilder generation = new StringBuilder();
        for (boolean cell : gen) {
            generation.append(cell ? "*" : ' ');
        }

        return generation.toString();
    }

    boolean[] nextGenA(boolean[] gen) {
        boolean[] next = new boolean[gen.length];
        for (int i = 0; i < gen.length; i++) {
            boolean left = (i > 0) && gen[i - 1];
            boolean right = (i < gen.length - 1) && gen[i + 1];

            if (gen[i]) {
                next[i] = left ^ right;
            } else {
                next[i] = left || right;
            }
        }
        return next;
    }

    boolean[] nextGenB(boolean[] gen) {
        boolean[] next = new boolean[gen.length];
        for (int i = 0; i < gen.length; i++) {
            boolean left = (i > 0) && gen[i - 1];
            boolean right = (i < gen.length - 1) && gen[i + 1];

            if (gen[i]) {
                next[i] = !right;
            } else {
                next[i] = left ^ right;
            }
        }
        return next;
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
