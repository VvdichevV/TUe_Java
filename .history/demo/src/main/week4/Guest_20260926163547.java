package week4;

public class Guest {
    private String name;
    private int size;
    private Cave cave;

    public Guest(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public boolean checkIn(Cave newCave) {
        if (cave == null && newCave.isFree() && newCave.getCapacity() > size) {
            this.cave = newCave;
            return true;
        }
        return false;
    }

    public boolean checkOut() {
        if (cave != null) {
            
        }
    }

    @Override
    public String toString() {
    }
}