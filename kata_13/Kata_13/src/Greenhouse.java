import java.util.*;

public class Greenhouse {

    Plant[] plants = new Plant[0];

    public void addPlant(Plant plant) {
        this.plants = Arrays.copyOf(this.plants, this.plants.length + 1);
        this.plants[this.plants.length - 1] = plant;
    }

    public void waterAll(int amount) {
        for (Plant plant : plants) {
            plant.water(amount);
        }
    }

    public void passDayForAll() {
        for (Plant plant : plants) {
            plant.passDay();
        }
    }

    public String[] getPlantsInDifficulty() {
        String[] plantsInDifficulty = new String[0];
        for (Plant plant : plants) {
            if (plant.getWaterLevel() < 2) {
                plantsInDifficulty = Arrays.copyOf((plantsInDifficulty), plantsInDifficulty.length + 1);
                plantsInDifficulty[plantsInDifficulty.length - 1] = plant.getName();
            }
        }
        return plantsInDifficulty;
    }

    public String countByStatus() {
        return (new Status(plants).getStatus());
    }
}

