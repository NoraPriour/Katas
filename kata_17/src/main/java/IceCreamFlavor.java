import java.util.ArrayList;

public class IceCreamFlavor {
    public String name;
    double price;
    int stock;

    public IceCreamFlavor(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double sell(int quantity) {
        if (quantity <= 0 || quantity > this.stock) {
            return 0;
        }
        this.stock -= quantity;
        return quantity*this.price;
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            this.stock += quantity;
        }
    }
}
