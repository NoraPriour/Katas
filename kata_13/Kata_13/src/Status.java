public class Status {
    public int seed = 0;
    public int sprout = 0;
    public int flower = 0;

    public Status(Plant[] plants) {
        for (Plant plant : plants) {
            if (plant.getStatus().equals("seed")) {
                this.seed ++;
            }
            if (plant.getStatus().equals("sprout")) {
                this.sprout ++;
            }
            if (plant.getStatus().equals("flower")) {
                this.flower ++;
            }
        }
    }

    public String getStatus() {
        return "{\n" + "\tseed: " + seed + "\n\tsprout: " + sprout + "\n\tflower: " + flower + "\n}";
    }
}
