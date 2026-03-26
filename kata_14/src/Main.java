
// Revue du code :
// Ajouter des prinlt
// Et choisir entre fr et en, car le mix des deux fait brouillon

void main() {
    Event workshop = new Event("Atelier rempotage", 10, 12, 12);
    Event concert = new Event("Concert acoustique", 11, 13, 20);
    Event picnic = new Event("Pique-nique collectif", 13, 15, 30);

    workshop.register(8);
    concert.register(20);
    picnic.register(10);

    SpringFestival festival = new SpringFestival("festival");
    festival.addEvent(workshop);
    festival.addEvent(concert);
    festival.addEvent(picnic);

    System.out.println("Conflit entre workshop et concert: " + workshop.hasConflictWith(concert));
    System.out.println("Conflit entre workshop et picnic: " + concert.hasConflictWith(picnic));
    System.out.println("Events où il reste des places: " + festival.getAvailableEvents());
    System.out.println("Places dispo pour picnic: " + picnic.getRemainingPlaces());
    System.out.println("Events en conflit avec workshop: " + festival.getConflictingEvents(workshop));
}
