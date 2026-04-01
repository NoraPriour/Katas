import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BeachClub {
    private String name;
    private int availableDeckchairs;
    private int availableUmbrellas;
    private int availableTowels;
    private List<Rental> rentals = new ArrayList<>();

    public BeachClub(String name, int deckchairs, int umbrellas, int towels) {
        this.name = name;
        this.availableDeckchairs = deckchairs;
        this.availableUmbrellas = umbrellas;
        this.availableTowels = towels;
    }

    public boolean rent(String customerName, int deckchairs, int umbrellas, int towels) {
        if ((deckchairs == 0 && umbrellas == 0 && towels == 0) || (deckchairs < 0 || umbrellas < 0 || towels < 0) || (deckchairs > this.availableDeckchairs || umbrellas > availableUmbrellas || towels > availableTowels)) {
            return false;
        }
        this.availableDeckchairs -= deckchairs;
        this.availableUmbrellas -= umbrellas;
        this.availableTowels -= towels;
        rentals.add(new Rental(customerName, deckchairs, umbrellas, towels));
        return true;
    }

    public Boolean returnRental(String customerName) {
        for (Rental rental : rentals) {
            if (Objects.equals(rental.customerName(), customerName)) {
                this.availableDeckchairs += rental.deckchairs();
                this.availableUmbrellas += rental.umbrellas();
                this.availableTowels += rental.towels();
                rentals.remove(rental);
                return true;
            }
        }
        return false;
    }

    public CurrentStock getRemainingStock() {
        return new CurrentStock(this.availableDeckchairs, this.availableUmbrellas, this.availableTowels);
    }

    public int getActiveRentalsCount() {
        return this.rentals.size();
    }
}
