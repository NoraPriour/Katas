public class Pitch {
    private int number;
    private String type;
    private int capacity;
    private int occupiedPeople = 0;

    public Pitch(int number, String type, int capacity) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getOccupiedPeople() {
        return occupiedPeople;
    }

    public int getNumber() {
        return number;
    }

    public Boolean checkIn(int count) {
        if (count <= 0 || occupiedPeople + count > capacity) {
            return false;
        }
        occupiedPeople += count;
        return true;
    }

    public Boolean checkOut(int count) {
        if (count <= 0 || count > occupiedPeople) {
            return false;
        }
        occupiedPeople -= count;
        return true;
    }

    public Boolean isFull() {
        return occupiedPeople == capacity;
    }
}