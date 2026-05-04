import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IceCreamShop {
    String name;
    ArrayList<IceCreamFlavor> flavors = new ArrayList();
    double revenue = 0;

    public IceCreamShop(String name) {
        this.name = name;
    }

    public void addFlavor(IceCreamFlavor flavor) {
        this.flavors.add(flavor);
    }

    public double sellFlavor(String name, int quantity) {
        IceCreamFlavor flavor = this.flavors.stream().filter(f -> f.name.equals(name)).findFirst().orElse(null);
        if (flavor == null) {
            return 0;
        }
        double amount = flavor.sell(quantity);
        this.revenue += amount;
        return amount;
    }

    public List<IceCreamFlavor> getLowStockFlavors() {
        return this.flavors.stream().filter(flavor -> flavor.stock < 5).collect(Collectors.toList());
    }

    public double getRevenue() {
        return this.revenue;
    }

    public List<IceCreamFlavor> getAvailableFlavors() {
        return this.flavors.stream().filter(flavor -> flavor.stock > 0).toList();
    }
}
