void main() {
    Plant tulip = new Plant("Tulip");
    Plant rose = new Plant("Rose");
    Plant daisy = new Plant ("Daisy");
    Plant lavender = new Plant ("Lavender");

    tulip.water(4);
    rose.water(6);
    daisy.water(2);
    lavender.water(8);

    tulip.passDay();
    rose.passDay();
    daisy.passDay();
    lavender.passDay();

    tulip.passDay();
    rose.passDay();
    daisy.passDay();
    lavender.passDay();

    tulip.water(2);
    rose.passDay();
    daisy.passDay();
    lavender.passDay();

    System.out.println(tulip.getSummary());
    System.out.println(rose.getSummary());
    System.out.println(daisy.getSummary());
    System.out.println(lavender.getSummary());
}
