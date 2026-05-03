import java.util.ArrayList;

public class WaterEquipment {
    public String name;
    ArrayList<Booking> bookings = new ArrayList<>();

    public WaterEquipment(String name) {
        this.name = name;
    }

    public Boolean isAvailable(int startHour, int endHour) {
        for (Booking booking : bookings) {
            if (startHour < booking.endHour && booking.startHour < endHour) {
                return false;
            }
        }
        return true;
    }

    public Boolean book(Booking booking) {
        if (booking.startHour >= booking.endHour || !isAvailable(booking.startHour, booking.endHour)) {
            return false;
        }
        bookings.add(booking);
        return true;
    }
}
