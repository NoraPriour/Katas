void main() {
    WaterEquipment paddle = new WaterEquipment("Paddle");
    WaterEquipment kayak = new WaterEquipment("Kayak");
    WaterEquipment surf = new WaterEquipment("Surf");
    WaterEquipment canoe = new WaterEquipment("Canoë");
    WaterEquipment windsurf = new WaterEquipment("Planche à voile");

    paddle.book(new Booking("Lina", 9, 11));
    paddle.book(new Booking("Sam", 13, 15));

    kayak.book(new Booking("Noa", 10, 12));
    kayak.book(new Booking("Ari", 15, 17));

    surf.book(new Booking("Mina", 8, 10));
    surf.book(new Booking("Jules", 10, 12));

    canoe.book(new Booking("Charlie", 14, 16));

    windsurf.book(new Booking("Nina", 9, 10));
    windsurf.book(new Booking("Noé", 11, 13));

    WaterCenter center = new WaterCenter("Bleu Azur");
    center.addEquipment(paddle);
    center.addEquipment(kayak);
    center.addEquipment(surf);
    center.addEquipment(canoe);
    center.addEquipment(windsurf);

    System.out.println("total bookings: " + center.getTotalBookings());
// attendu : 9

    System.out.println("Equipements disponibles de 10 à 11 : " + center.findAvailableEquipment(10, 11).stream().map((e) -> e.name).toList());
// attendu : ["Canoë", "Planche à voile"]

    System.out.println("Equipements disponibles de 12 à 13 : " + center.findAvailableEquipment(12, 13).stream().map((e) -> e.name).toList());
// attendu : ["Paddle", "Kayak", "Surf", "Canoë"]

    System.out.println("Equipements avec au moins une réservation : " + center.getBusyEquipment().stream().map((e) -> e.name).toList());
// attendu : tous les équipements
}