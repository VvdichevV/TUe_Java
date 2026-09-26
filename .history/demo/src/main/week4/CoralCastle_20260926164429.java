package week4;

public class CoralCastle {
    private String name;
    private Cave[] caves;

    public CoralCastle(String name, int numberOfCaves) {
        this.name = name;
        this.caves = new Cave[numberOfCaves];
        for(Cave cave : caves)
    }

    public Cave checkIn(String guestName, int guestSize) {
    }

    public boolean checkOut(String guestName) {
    }

    public Cave getCaveByGuestName(String guestName) {
    }

    @Override
    public String toString() {
    }
}