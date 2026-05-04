void main() {
    IceCreamFlavor vanilla = new IceCreamFlavor("Vanille", 3.5, 12);
    IceCreamFlavor chocolate = new IceCreamFlavor("Chocolat", 4, 8);
    IceCreamFlavor strawberry = new IceCreamFlavor("Fraise", 3.8, 15);
    IceCreamFlavor pistachio = new IceCreamFlavor("Pistache", 4.5, 4);
    IceCreamFlavor mango = new IceCreamFlavor("Mangue", 4.2, 6);
    IceCreamFlavor lemon = new IceCreamFlavor("Citron", 3.2, 3);

    IceCreamShop shop = new IceCreamShop("La Vague Sucrée");
    shop.addFlavor(vanilla);
    shop.addFlavor(chocolate);
    shop.addFlavor(strawberry);
    shop.addFlavor(pistachio);
    shop.addFlavor(mango);
    shop.addFlavor(lemon);

    System.out.println(shop.sellFlavor("Vanille", 3));   // 10.5
    System.out.println(shop.sellFlavor("Chocolat", 2));  // 8
    System.out.println(shop.sellFlavor("Pistache", 4));  // 18
    System.out.println(shop.sellFlavor("Citron", 1));    // 3.2
    System.out.println(shop.sellFlavor("Mangue", 7));    // 0 (stock insuffisant)
    System.out.println(shop.sellFlavor("Fraise", 5));    // 19

    System.out.println(shop.getRevenue());
// attendu : 58.7

    System.out.println(shop.getLowStockFlavors().stream().map(f -> f.name).collect(Collectors.toList()));
// attendu : ["Pistache", "Citron"]

    System.out.println(
            shop.getAvailableFlavors()
                    .stream()
                    .map(f -> f.name + ":" + f.stock)
                    .toList()
    );
    // exemple attendu : ["Vanille:9", "Chocolat:6", "Fraise:10", "Mangue:6", "Citron:2"]
}