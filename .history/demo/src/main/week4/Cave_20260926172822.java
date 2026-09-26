package week4;

public class Cave {
    private int number;
    private int capacity;
    private Guest guest;

    public Cave(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public Guest getGuest() {
        return guest;
    }

    public boolean isFree() {
        return guest == null;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        if (isFree()) {
            return "Cave[" + number + ", capacity=" + capacity + ", free]";
        }
        return "Cave[" + number + ", capacity=" + capacity + ", guest=" + guest + "]";
    }
}