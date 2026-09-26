package week4;

public class CoralCastle {
    private String name;
    private Cave[] caves;

    public CoralCastle(String name, int numberOfCaves) {
        this.name = name;
        this.caves = new Cave[numberOfCaves];
        for (int i = 0; i < numberOfCaves; i++) {
            caves[i] = new Cave(101 + i, (i % 4 + 2));
        }
    }

    public Cave checkIn(String guestName, int guestSize) {
        Guest guest = new Guest(guestName, guestSize);
        for (int i = 0; i < caves.length; i++) {
            if (guest.checkIn(caves[i])) {
                return caves[i];
            }
        }
        return null;
    }

    public boolean checkOut(String guestName) {
        for(Cave cave : caves){
            cave.getGuest().
        }
    }

    public Cave getCaveByGuestName(String guestName) {
    }

    @Override
    public String toString() {
    }
}