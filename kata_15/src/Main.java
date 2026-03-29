void main() {
    BeachClub beachClub = new BeachClub("Sunny Waves", 20, 12, 30);

    beachClub.rent("Lina", 2, 1, 2);
    beachClub.rent("Sam", 4, 2, 4);
    beachClub.rent("Noa", 1, 1, 1);
    beachClub.rent("Ari", 6, 3, 6);
    beachClub.rent("Mina", 3, 2, 3);

    // tests
    IO.println(beachClub.getRemainingStock());
    IO.println(beachClub.getActiveRentalsCount());
    IO.println(beachClub.rent("Charlie", 5, 1, 2));
    IO.println(beachClub.returnRental("Sam"));
    IO.println(beachClub.getRemainingStock());
    IO.println(beachClub.getActiveRentalsCount());
    IO.println(beachClub.returnRental("Unknown"));
}
