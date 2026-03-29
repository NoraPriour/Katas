void main() {
    Pitch pitch1 = new Pitch(1, "tent", 4);
    Pitch pitch2 = new Pitch(2, "van", 2);
    Pitch pitch3 = new Pitch(3, "tent", 6);
    Pitch pitch4 = new Pitch(4, "caravan", 5);
    Pitch pitch5 = new Pitch(5, "tent", 3);
    Pitch pitch6 = new Pitch(6, "van", 2);

    pitch1.checkIn(2);
    pitch2.checkIn(2);
    pitch3.checkIn(6);
    pitch4.checkIn(4);
    pitch5.checkIn(1);
    pitch6.checkIn(2);

    SummerCamp camp = new SummerCamp("Les Pins Dorés");
    camp.addPitch(pitch1);
    camp.addPitch(pitch2);
    camp.addPitch(pitch3);
    camp.addPitch(pitch4);
    camp.addPitch(pitch5);
    camp.addPitch(pitch6);

    //tests
    IO.println(camp.getTotalOccupiedPeople());
    IO.println(camp.getFullPitchesCount());
    IO.println(camp.getAvailablePitches().stream().map(Pitch::getNumber).collect(Collectors.toList()));
    IO.println(camp.getPitchesByType("tent").stream().map(Pitch::getNumber).collect(Collectors.toList()));
    IO.println(pitch4.checkOut(2));
    IO.println(camp.getTotalOccupiedPeople());
}