package week3;

public class FishPatterns {
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void nl() {
        System.out.println();
    }

    public static void printSpaces(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public static void printFish(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("><(((’>");
            printSpaces(1);
        }
    }

    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ><(((’> ");
            }
            System.out.println();
        }
    }

    public static void printFishSchool() {
        int numFish = 1;
        for (int i = 18; i > 0; i -= 6) {
            printSpaces(i);
            printFish(i);
        }

    }
}
