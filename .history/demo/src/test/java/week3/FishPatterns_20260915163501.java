package week3;

public class FishPatterns {
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void nl(){System.out.println();}
    public staitc void 
    public static void printFish(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("><(((’>");
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
}
