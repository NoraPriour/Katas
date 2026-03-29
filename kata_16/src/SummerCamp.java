import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SummerCamp {
    private final String name;
    private List<Pitch> pitches = new ArrayList<>();

    public SummerCamp(String name) {
        this.name = name;
    }

    public void addPitch(Pitch pitch) {
        pitches.add(pitch);
    }

    public List<Pitch> getAvailablePitches() {
        return this.pitches.stream().filter(pitch -> !pitch.isFull()).collect(Collectors.toList());
    }

    public List<Pitch> getPitchesByType(String type) {
        return this.pitches.stream().filter(pitch -> Objects.equals(pitch.getType(), type)).collect(Collectors.toList());
    }

    public int getTotalOccupiedPeople() {
        int totalOccupiedPeople = 0;
        for (Pitch pitch : pitches) {
            totalOccupiedPeople += pitch.getOccupiedPeople();
        }
        return totalOccupiedPeople;
    }

    public int getFullPitchesCount(){
        int fullPitchesCount = 0;
        for (Pitch pitch : pitches) {
            if (pitch.isFull()) {
                fullPitchesCount++;
            }
        }
        return fullPitchesCount;
    }
}