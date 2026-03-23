import java.util.Arrays;


void main() {
    Greenhouse greenhouse = new Greenhouse();

    Plant tulip = new Plant("Tulipe");
    Plant daisy = new Plant("Pâquerette");
    Plant rose = new Plant("Rose");

    greenhouse.addPlant(tulip);
    greenhouse.addPlant(daisy);
    greenhouse.addPlant(rose);

    greenhouse.waterAll(4);
    greenhouse.passDayForAll();
    greenhouse.passDayForAll();

    System.out.println("Plantes en difficulté: " + Arrays.toString(greenhouse.getPlantsInDifficulty()));
    System.out.println(greenhouse.countByStatus());
}
