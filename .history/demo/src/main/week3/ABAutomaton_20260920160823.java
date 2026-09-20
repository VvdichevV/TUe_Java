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
        StringBuilder generation = new StringBuilder();
        for (boolean cell : gen) {
            generation.append(cell ? "*" : ' ');
        }

        return generation.toString();
    }

    boolean[] nextGenA(boolean[] gen) {
        for (int i = 0; i < gen.length; i++) {
            if (gen[i]) {
                if (!(i > 0 && gen[i - 1] || i < gen.length - 1 && gen[i + 1])) {
                    gen[i] = false;
                }
            } else {
                if (!(i > 0 && gen[i - 1] || i < gen.length - 1 && gen[i + 1])) {
                    gen[i] = false;
                }
            }
        }
        return new boolean[] { true, false };
    }

    boolean[] nextGenB(boolean[] gen) {
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
                initGen[Integer.parseInt(token)] = true;
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
