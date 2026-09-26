package week3;

public class FishPatterns {
    public static void main(String[] args) {
        printFish(3);
    }

    public static void printFish(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(" ><(((’> ");
        System.out.println();
    }

    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ><(((’> "););
            }
        }
    }
}
