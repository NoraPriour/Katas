public class Rental {
    private String customerName;
    private int deckchairs;
    private int umbrellas;
    private int towels;

    public Rental(String name, int deckchairs, int umbrellas, int towels) {
        this.customerName = name;
        this.deckchairs = deckchairs;
        this.umbrellas = umbrellas;
        this.towels = towels;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getDeckchairs() {
        return deckchairs;
    }

    public int getUmbrellas() {
        return umbrellas;
    }

    public int getTowels() {
        return towels;
    }
}
