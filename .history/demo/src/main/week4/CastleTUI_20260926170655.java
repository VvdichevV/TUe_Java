package week4;

import java.util.Scanner;

public class CastleTUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coralCastleName = sc.nextLine();
        int numberOfCaves = sc.nextInt();
        CoralCastle coralCastle = new CoralCastle(coralCastleName, numberOfCaves);
        System.out.printf("Castle %s created with %d caves. Type 'help' for commands.\n", coralCastleName,
                numberOfCaves);
                while
        sc.close();
    }
}
