public class Plant {
    private final String name;
    private int waterLevel = 0;
    private int growthLevel = 0;
    private String status = "seed";

    public Plant(String name) {
        this.name = name;
    }

    public void water(int amount) {
        if (amount > 0) {
            this.waterLevel += amount;
        }
    }

    public void passDay() {
        if (this.waterLevel == 1) {
            this.waterLevel = 0;
        }
        if (this.waterLevel >= 2) {
            this.waterLevel -= 2;
            this.growthLevel += 1;
        }
        if (growthLevel >= 3) {
            this.status = "sprout";
        }
        if (growthLevel >= 6) {
            this.status = "flower";
        }
    }

    public String getName() {
        return this.name;
    }

    public int getWaterLevel() {
        return this.waterLevel;
    }

    public String getStatus () {
        return this.status;
    }
}