public class CurrentStock {
    private int availableDeckchairs;
    private int availableUmbrellas;
    private int availableTowels;

    public CurrentStock(int availableDeckchairs, int availableUmbrellas, int availableTowels) {
        this.availableDeckchairs = availableDeckchairs;
        this.availableUmbrellas = availableUmbrellas;
        this.availableTowels = availableTowels;
    }

    @Override
    public String toString() {
        return "CurrentStock {" +
                "deckchairs=" + availableDeckchairs +
                ", umbrellas=" + availableUmbrellas +
                ", towels=" + availableTowels +
                '}';
    }
}
