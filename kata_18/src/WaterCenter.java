import java.util.ArrayList;
import java.util.stream.Collectors;

public class WaterCenter {
    public String name;
    ArrayList<WaterEquipment> equipmentList = new ArrayList<>();

    public WaterCenter(String name) {
        this.name = name;
    }

    public void addEquipment(WaterEquipment equipment) {
        equipmentList.add(equipment);
    }

    public ArrayList<WaterEquipment> findAvailableEquipment(int startHour, int endHour) {
        return this.equipmentList.stream()
                .filter(equipment -> equipment.isAvailable(startHour, endHour))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public int getTotalBookings() {
        int result = 0;
        for (WaterEquipment equipment : equipmentList) {
            result += equipment.bookings.size();
        }
        return result;
    }

    public ArrayList<WaterEquipment> getBusyEquipment() {
        return this.equipmentList.stream()
                .filter(equipment -> !equipment.bookings.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
