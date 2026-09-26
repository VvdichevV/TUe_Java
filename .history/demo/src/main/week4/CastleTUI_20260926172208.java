package week4;

import java.util.Scanner;

public class CastleTUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coralCastleName = sc.nextLine();
        int numberOfCaves = sc.nextInt();
        CoralCastle coralCastle = new CoralCastle(coralCastleName, numberOfCaves);
        System.out.printf("Castle %s created with %d caves. ", coralCastleName, numberOfCaves);
        System.out.println("Type 'help' for commands.");

        mainLoop: while (true) {
            String command = sc.next();

            switch (command) {
                case "in":
                    String name = sc.next();
                    int size = sc.nextInt();
                    if (coralCastle.checkIn(name, size) != null) {
                        System.out.printf("Guest %s gets cave %d%n", name, size);
                    } else {
                        System.out.println("No suitable cave available for " + name);
                    }
                    break;
                case "out":
                    name = sc.next();
                    if (coralCastle.checkOut(name)) {
                        System.out.println(name + " has checked out.");
                    } else {
                        System.out.printf("Guest %s is not in the castle.%n", name);
                    }
                    break;
                case "cave":
                    name = sc.next();
                    Cave cave = coralCastle.getCaveByGuestName(name);
                    if (cave != null) {
                        System.out.printf("Guest %s is in cave %d%n", name, cave.getNumber());
                    } else {
                        System.out.printf("Guest %s doesn't have a cave.%n", name);
                    }
                    break;
                case "print":
                    System.out.println(coralCastle.toString());
                    break;
                case "help":
                    System.out.println("Commands:\r\n" + //
                            "in [name] [size] - Check in a guest with the given name and size\r\n" + //
                            "out [name] - Check out the guest with the given name\r\n" + //
                            "cave [name] - Show the cave number of the guest with the name\r\n" + //
                            "print - Print the current state of the castle\r\n" + //
                            "help - Show this help menu\r\n" + //
                            "exit - Exit the program");
                case "exit":
                    break mainLoop;
                default:
                    break;
            }
        }
        sc.close();
    }
}
